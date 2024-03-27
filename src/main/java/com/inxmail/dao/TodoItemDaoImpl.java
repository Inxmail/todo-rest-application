package com.inxmail.dao;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.inxmail.entity.TodoItem;

@Component
public class TodoItemDaoImpl implements TodoItemDao {

    private final JdbcTemplate jdbcTemplate;

    public TodoItemDaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<TodoItem> getAll() {
        return jdbcTemplate.query("SELECT * FROM todo_items", new BeanPropertyRowMapper<>(TodoItem.class));
    }


    @Override
    public TodoItem getByDescription( String description )
    {
        Object[] params = List.of( description ).toArray();
        return jdbcTemplate.queryForObject( "SELECT * FROM todo_items WHERE description = ?", params, new BeanPropertyRowMapper<>(TodoItem.class) );
    }

}
