package com.example.checkinout
import java.time.LocalDate
fun hasPermission(employee: Employees, date: LocalDate, permissions: List<Permission>): Boolean {
    val permission = permissions.firstOrNull{it.date==date && it.employee==employee}
    return (permission!=null)
}
