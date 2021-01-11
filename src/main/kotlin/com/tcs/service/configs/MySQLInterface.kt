package com.tcs.service.configs

import com.tcs.service.model.Daan
import org.springframework.context.annotation.Bean
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface MySQLInterface : JpaRepository<Daan,Int> {


}

