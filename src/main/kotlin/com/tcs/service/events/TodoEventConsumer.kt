package com.tcs.service.events


//import com.tcs.service.model.Todo
import com.tcs.service.model.TodoCreated
import com.tcs.service.model.TodoDeleted
import com.tcs.service.model.TodoUpdated
//import io.eventuate.tram.events.subscriber.DomainEventHandlers
//import io.eventuate.tram.events.subscriber.DomainEventHandlersBuilder
import org.springframework.beans.factory.annotation.Autowired


class TodoEventConsumer {
  //  @Autowired
//    private val todoViewService: TodoViewService? = null
//    fun domainEventHandlers(): DomainEventHandlers {
//        println("DOMAIN EVENT HANDLER")
//        println(Todo::class.java.name)
//        return DomainEventHandlersBuilder
//                .forAggregateType(Todo::class.java.name)
//                .onEvent(TodoCreated::class.java) { dee ->
//                    val todoCreated: TodoCreated = dee.event
////                    todoViewService.index(TodoView(dee.getAggregateId(),
////                            todoCreated.getTitle(), todoCreated.isCompleted(), todoCreated.getExecutionOrder()))
//                }
//                .onEvent(TodoUpdated::class.java) { dee ->
//                    val todoUpdated: TodoUpdated = dee.event
//                    println(dee.event)
//                    println(todoUpdated)
////                    todoViewService.index(TodoView(dee.getAggregateId(),
////                            todoUpdated.getTitle(), todoUpdated.isCompleted(), todoUpdated.getExecutionOrder()))
//                }
////                .onEvent(TodoDeleted::class.java) { dee -> todoViewService.remove(dee.aggregateId) }
//                .build()
//    }
}