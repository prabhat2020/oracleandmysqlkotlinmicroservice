package com.tcs.service.configs

import org.springframework.boot.jdbc.DataSourceBuilder
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.data.jpa.repository.config.EnableJpaRepositories
import org.springframework.transaction.annotation.EnableTransactionManagement
import javax.sql.DataSource
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder

import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean
import org.springframework.orm.jpa.JpaTransactionManager

import javax.persistence.EntityManagerFactory

import org.springframework.transaction.PlatformTransactionManager










@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(entityManagerFactoryRef = "barEntityManagerFactory",
    transactionManagerRef = "barTransactionManager",
    basePackages = ["com.tcs.service.configs"])
class MySql {


    @Bean(name = ["barDataSource"])
    @ConfigurationProperties(prefix = "bar.datasource")
    fun dataSource(): DataSource? {
        return DataSourceBuilder.create().driverClassName("com.mysql.cj.jdbc.Driver")
            .url("jdbc:mysql://20.76.60.209:3306/eventuate").username("root").password("password").build()
    }

    @Bean(name = ["barEntityManagerFactory"])
    fun barEntityManagerFactory(
        builder: EntityManagerFactoryBuilder,
        @Qualifier("barDataSource") dataSource: DataSource?
    ): LocalContainerEntityManagerFactoryBean? {
        return builder
            .dataSource(dataSource)
            .packages("com.tcs.service.model")
            .persistenceUnit("Daan")
            .build()
    }

    @Bean(name = ["barTransactionManager"])
    fun barTransactionManager(
        @Qualifier("barEntityManagerFactory") barEntityManagerFactory: EntityManagerFactory?
    ): PlatformTransactionManager? {
        return JpaTransactionManager(barEntityManagerFactory!!)
    }

//    @Bean
//    fun getDatasource() : DataSource {
//        println("It's hitting here")
//        val dataconn =
//            DataSourceBuilder.create().
//            driverClassName("com.mysql.cj.jdbc.Driver").url("jdbc:mysql://20.76.60.209:3306/eventuate")
//                .username("root").password("password").build()
//
//        return dataconn
//    }



}