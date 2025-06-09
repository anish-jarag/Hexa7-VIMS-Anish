package com.hexaware.vims.model;

import com.hexaware.vims.model.enums.NotificationType;

public class Notification {
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
