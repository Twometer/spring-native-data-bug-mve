package com.example.demo.repo

import com.example.demo.model.Booking
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface BookingRepository : JpaRepository<Booking, UUID>