package com.example.checkinout

import java.time.LocalDate

data class Permission (val employee: Employees,
                       val date: LocalDate,
                       val justification: String,
)



