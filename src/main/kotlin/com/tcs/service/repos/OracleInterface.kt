package com.tcs.service.repos

import com.tcs.service.model.ASN
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.*

//@Repository
//public interface Prepare extends DomainEvent {
//}
@Repository
interface OracleInterface  : JpaRepository<ASN,String> {
   override fun findById(id: String): Optional<ASN>
}