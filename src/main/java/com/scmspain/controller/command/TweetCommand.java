package com.scmspain.controller.command;

import com.scmspain.entities.Notification;

public abstract class TweetCommand {
    Notification notification = new Notification();

    public abstract void validate();

    public boolean hasErrors() {
        return notification.hasErrors();
    }

    public String getErrors() {
        return notification.errorMessage();
    }
}
