package com.amigoscode.demo.notification;

import java.time.ZonedDateTime;
import java.util.Objects;

public class Notification {
    private String message;
    private ZonedDateTime timestamp;

    public Notification(String message, ZonedDateTime timestamp) {
        this.message = message;
        this.timestamp = timestamp;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ZonedDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(ZonedDateTime timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Notification)) return false;
        Notification that = (Notification) o;
        return getMessage().equals(that.getMessage()) && getTimestamp().equals(that.getTimestamp());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMessage(), getTimestamp());
    }

    @Override
    public String toString() {
        return "Notification{" +
                "message='" + message + '\'' +
                ", timestamp=" + timestamp +
                '}';
    }
}
