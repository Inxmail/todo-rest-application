package com.inxmail.todoapp.rest.dto;

import java.time.LocalDateTime;

public record TodoItemResponse(long id, String description, LocalDateTime dueDateTime) {
}
