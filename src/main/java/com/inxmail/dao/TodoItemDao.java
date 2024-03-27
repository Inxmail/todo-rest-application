package com.inxmail.dao;

import java.util.List;

import com.inxmail.entity.TodoItem;


public interface TodoItemDao {

    List<TodoItem> getAll();


    TodoItem getByDescription( String description );
}
