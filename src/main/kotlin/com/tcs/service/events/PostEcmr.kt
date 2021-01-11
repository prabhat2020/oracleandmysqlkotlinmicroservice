package com.tcs.service.events

import io.eventuate.tram.events.common.DomainEvent
import org.springframework.data.domain.DomainEvents

class PostEcmr : DomainEvent {

    var id:Int =0
    var MessageNo:String = ""

    constructor() {}
    constructor(message: String) {
        this.MessageNo = message

    }
}

