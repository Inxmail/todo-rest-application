package com.inxmail.rest.dto;

import java.util.Date;


public record TodoItemResponse(long id, String description, Date dueDate) {
}
