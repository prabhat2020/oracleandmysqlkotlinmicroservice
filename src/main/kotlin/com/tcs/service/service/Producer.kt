package com.tcs.service.service

import com.tcs.service.configs.MySQLInterface
import com.tcs.service.events.PostEcmr
import com.tcs.service.model.Daan
import io.eventuate.tram.events.common.DomainEvent
import io.eventuate.tram.events.publisher.DomainEventPublisher
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
//import org.springframework.kafka.core.KafkaTemplate
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import java.util.*

@Service
@Transactional
class Producer(private val repo: MySQLInterface) {

@Autowired
lateinit var  domainEventPublisher: DomainEventPublisher

fun create(createDaan : Daan) {
  var create=  repo.save(createDaan)
  publishTodoEvent(create,PostEcmr(createDaan.MessageNo))
}

    fun publishTodoEvent(daan: Daan, vararg domainEvents: DomainEvent) {
        domainEventPublisher!!.publish(Daan::class.java, daan.id, Arrays.asList(*domainEvents))
    }
//    private val logger = LoggerFactory.getLogger(Producer::class.java)
//    private val TOPIC = "users"
//
//    @Autowired
//    lateinit var kafkaTemplate: KafkaTemplate<String, String>
//
//    fun sendMessage(message: String){
//        println("It came in Producer")
//        logger.info(String.format("#### -> Producing message -> %s", message))
//        this.kafkaTemplate.send(TOPIC, message)
//    }
}