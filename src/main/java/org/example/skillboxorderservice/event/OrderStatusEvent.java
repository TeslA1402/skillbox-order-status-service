package org.example.skillboxorderservice.event;

import java.time.Instant;

public record OrderStatusEvent(String status, Instant date) {
}
