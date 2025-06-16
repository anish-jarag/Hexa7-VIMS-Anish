package com.example.vims_backend.entity;

import com.example.vims_backend.entity.enums.NotificationType;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Notification {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int notificationId;
    private int userId;
    private String message;
    private String sentAt;
    private NotificationType type;

    public Notification() {}

    public Notification(int notificationId, int userId, String message,
                        String sentAt, NotificationType type) {
        this.notificationId = notificationId;
        this.userId = userId;
        this.message = message;
        this.sentAt = sentAt;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Notification [notificationId=" + notificationId + ", userId=" + userId + ", message=" + message
                + ", sentAt=" + sentAt + ", type=" + type + "]";
    }

    public int getNotificationId() {
        return notificationId;
    }

    public void setNotificationId(int notificationId) {
        this.notificationId = notificationId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getSentAt() {
        return sentAt;
    }

    public void setSentAt(String sentAt) {
        this.sentAt = sentAt;
    }

    public NotificationType getType() {
        return type;
    }

    public void setType(NotificationType type) {
        this.type = type;
    }

    
}
