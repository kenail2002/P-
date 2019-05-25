package com.ppai.timemgr.tasklist.main

import com.ppai.timemgr.tasklist.main.dao.TaskRepo
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Repository
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@Repository("repository")
class TaskRepository {
    @Autowired
    private val taskRepo: TaskRepo? = null

    fun save(personStream: List<Task>): Any {
        personStream.forEach{ taskRepo!!.save(it)}
        System.out.println("save")
        println((personStream))
//        personStream.subscribe(TaskSubscriber())
        return true
    }

    fun findAll(): Flux<Task> {

        TODO("")
    }

    fun findOne(id: String): Mono<Task> {
        System.out.println("findOne")
        TODO("")


    }
}
