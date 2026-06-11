package com.inavflightintelligence.domain

data class FlightSample(
    val timeSeconds: Double? = null,
    val altitudeMeters: Double? = null,
    val speedMetersPerSecond: Double? = null,
    val distanceFromHomeMeters: Double? = null,
    val voltage: Double? = null,
    val currentAmps: Double? = null,
    val consumedMah: Double? = null,
    val gpsSatellites: Int? = null,
    val gpsFix: Int? = null
)
