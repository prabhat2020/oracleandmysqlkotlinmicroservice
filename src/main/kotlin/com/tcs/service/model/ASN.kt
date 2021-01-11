package com.tcs.service.model

import javax.persistence.*

@Entity
@Table(name = "ASN")
@org.springframework.data.relational.core.mapping.Table
data class ASN(
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "id_Sequence")
    @SequenceGenerator(name = "id_Sequence", sequenceName = "ID_SEQ")
    @Column(name = "DEPARTURE_ID")
    var DEPARTURE_ID:String,
    var GLNSHIPFROM:String,
    var GLNSHIPTO:String,
    var REFERENCENUMBEROFTRIP:String,
    var FINISHEDLOADINGDATETIME:String,
    var CONTAINERTYPEGTINPRIMARYCONTAI:String,
    var SHIPUNITSSCC:String,
    var REFNUMBERPOINTOFDESTINATION:String,
    var TOTALLOADWEIGHT:Int,
    var UOMWEIGHT:String,
    var NUMBEROFPRIMARYCONTAINERS:Int,
    var CONTAINERTYPEGTIN:String,
    var NUMBEROFCONTAINERS:Int



)