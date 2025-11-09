package pl.wsb.fitnesstracker.healthmetrics.api;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.annotation.Nullable;

import java.time.LocalDate;

public record HealthMetricsDto(
        @Nullable Long id,
        Long userId,
        @JsonFormat(pattern = "yyyy-MM-dd") LocalDate date,
        @Nullable Double weight,
        @Nullable Double height,
        @Nullable Integer heartRate
) {
}