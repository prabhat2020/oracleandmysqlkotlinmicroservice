package com.tcs.service.DAO


import com.tcs.service.configs.MySQLInterface
import com.tcs.service.model.ASN
import com.tcs.service.model.Daan
import com.tcs.service.repos.OracleInterface
//import org.springframework.stereotype.Repository
import org.springframework.stereotype.Service
import java.util.*

@Service
class ShipService (private val wmsInterface: OracleInterface,private val sq:MySQLInterface) {

    fun getShipByID(id:String): Optional<ASN> {
        return wmsInterface.findById(id)
    }

    fun getAll(): MutableList<ASN> {
        return wmsInterface.findAll()
    }

    fun getDa(): MutableList<Daan> {
        return  sq.findAll()
    }
}