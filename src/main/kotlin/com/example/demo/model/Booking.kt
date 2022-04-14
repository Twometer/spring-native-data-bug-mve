package com.example.demo.model

import java.util.*
import javax.persistence.Entity
import javax.persistence.Id

@Entity
data class Booking(
        @Id
        var id: UUID,
        var dummy: String
)