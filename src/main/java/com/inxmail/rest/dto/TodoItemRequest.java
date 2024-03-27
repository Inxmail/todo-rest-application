package com.inxmail.rest.dto;

import java.util.Date;


public record TodoItemRequest(String description, Date dueDate) { }
