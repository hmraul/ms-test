package com.scmspain.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Notification {
    List<String> errors = new ArrayList<>();

    public String errorMessage() {
        return errors.stream().collect(Collectors.joining(", "));
    }

    public void addError(String error) {
        errors.add(error);
    }

    public boolean hasErrors() {
        return !errors.isEmpty();
    }
}
