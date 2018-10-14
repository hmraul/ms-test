package com.scmspain.entities;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class NotificationTest {
    private Notification notification;

    @Before
    public void setUp() {
        notification = new Notification();
    }

    @Test
    public void should_not_have_errors_on_init() {
        assertFalse(notification.hasErrors());
    }

    @Test
    public void should_has_errors_when_adding_an_error() {
        notification.addError("Error");
        assertTrue(notification.hasErrors());
    }

    @Test
    public void should_return_error_added() {
        String error = "Error";
        notification.addError(error);

        assertEquals(error, notification.errorMessage());
    }

    @Test
    public void should_return_concatenated_errors_added() {
        String error = "Error";
        String another_error = "another error";
        notification.addError(error);
        notification.addError(another_error);

        assertEquals(error + ", " + another_error, notification.errorMessage());
    }
}
