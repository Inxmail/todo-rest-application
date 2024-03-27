package com.inxmail.todoapp.entity;

import java.time.LocalDateTime;

public record TodoItem(Long id, String description, LocalDateTime dueDateTime) { }
