package com.tcs.service.controller

//import com.tcs.service.DAO.ShipService
//import com.tcs.service.configs.MySQLInterface
import com.tcs.service.DAO.ShipService
import com.tcs.service.model.ASN
import com.tcs.service.model.Daan
import com.tcs.service.service.Producer
//import com.tcs.service.repos.OracleInterface
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
@RequestMapping("/api")
class Controller(
  private val ship: ShipService,
private val produce: Producer ) {


    @GetMapping("/wms")
    fun getWMS(): ResponseEntity<MutableList<ASN>> {
        return ResponseEntity.ok().body(ship.getAll())
    }

    @GetMapping("/daan")
    fun get(): ResponseEntity<MutableList<Daan>> {
        return ResponseEntity.ok().body(ship.getDa())
    }

    @RequestMapping("/post",method = [RequestMethod.POST])
    fun create(@RequestBody createDaan: Daan) {

   var create = produce.create(createDaan)

    }
}