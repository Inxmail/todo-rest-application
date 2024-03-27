CREATE TABLE IF NOT EXISTS todo_items(
    id BIGINT NOT NULL PRIMARY KEY ,
    description varchar,
    due_date timestamp,
    done BOOLEAN
);

INSERT INTO TODO_ITEMS VALUES(22, 'Dies Das', '2024-03-28 12:00', false);