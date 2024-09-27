package com.example.ticketbookingapp.Models

data class Seat(var status:SeatStatus, var name:String) {
    enum class SeatStatus {
        AVAILABLE, SELECTED, UNAVAILABLE
    }
}
