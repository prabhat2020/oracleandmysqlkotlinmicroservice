package com.tcs.service.model

import javax.persistence.*

@Entity
@Table(schema = "eventuate")
@org.springframework.data.relational.core.mapping.Table
data class Daan(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id:Int ,
    var MessageNo:String
) {
}