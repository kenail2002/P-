package com.ppai.timemgr.tasklist.bean;

import android.content.Context;
import android.database.Cursor;

import com.ppai.timemgr.tasklist.bean.TaskEntity;
import com.ppai.timemgr.tasklist.db.DataVisitor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class TasksContainer {

    /**
     * An array of sample (dummy) items.
     */
    public static List<TaskEntity> ITEMS = new ArrayList();

    public static List<String> keys = new ArrayList<String>();


    /**
     * A map of sample (dummy) items, by ID.
     */
    public static Map<String, TaskEntity> ITEM_MAP = new HashMap();
    private static Context ctx = null;
  private static DataVisitor dv= null;
  public static void fetchDataFromDB(Context context)
  {
      if(null!=context)
      {setContext( context);
      }
      if(ctx!=null)
      {
          dv =new DataVisitor(ctx);
          dv.open();
         List<TaskEntity> ts= dv.getAllTasks();
         if(!ts.isEmpty())
         {
             ITEMS =ts;
         }
         else
         {
            //增加样例数据
             for(int i=0;i<5;i++){
           ts.add(new TaskEntity(String.valueOf(i),"任务"+i,"详细信息"+i));}
         }

      }

  }




    private static void setContext(Context context) {
        ctx = context;
    }

    private static void addItem(TaskEntity item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.getId(), item);
        keys.add(item.getId());
    }

}
