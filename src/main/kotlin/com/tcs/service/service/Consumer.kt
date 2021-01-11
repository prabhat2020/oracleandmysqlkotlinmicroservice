package com.tcs.service.service

//import com.tcs.service.model.PrepareEcmr
//import io.eventuate.tram.events.subscriber.DomainEventHandlers
//import io.eventuate.tram.events.subscriber.DomainEventHandlersBuilder
import org.slf4j.LoggerFactory
//import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Service

@Service
class Consumer {
 //   private val logger = LoggerFactory.getLogger(Producer::class.java)

//    @KafkaListener(topicPattern = "users", groupId = "group_id")
//    fun consume(message: String) {
//        println("iT came in consume")
//        println(message)
//        logger.info(String.format("#### -> Consumed message -> %s", message))
//    }

//    fun domainEventHandlers() : DomainEventHandlers {
//
//        return DomainEventHandlersBuilder
//            .forAggregateType("users")
//            .onEvent(PrepareEcmr::class.java).build()
//    }
//}
//
//private fun DomainEventHandlersBuilder.onEvent(java: Class<PrepareEcmr>): DomainEventHandlersBuilder? {
//
//}
}
