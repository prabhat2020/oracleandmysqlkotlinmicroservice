package com.tcs.service.model

import javax.persistence.*


//@Entity
//@Table(schema = "eventuate")
@Access(AccessType.FIELD)
class Todo1 {
    @Id
//   @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null
    var title: String? = null
    var isCompleted = false
    var executionOrder = 0

    constructor() {}
    constructor(title: String?, completed: Boolean, executionOrder: Int) {
        this.title = title
        isCompleted = completed
        this.executionOrder = executionOrder
    }
}
