package com.example.demo

import com.example.demo.repo.BookingRepository
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import java.util.function.Function

@Configuration
class DemoHandler {

    @Bean
    fun helloWorld(bookingRepository: BookingRepository) = Function<String, String> {
        bookingRepository.findAll().toString()
    }

}