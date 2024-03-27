package com.inxmail.todoapp.rest.dto;

import java.time.LocalDateTime;

public record TodoItemRequest(String description, LocalDateTime dueDateTime) { }
