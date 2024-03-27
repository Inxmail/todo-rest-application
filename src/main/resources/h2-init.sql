CREATE TABLE todo_items(
    id BIGINT NOT NULL auto_increment PRIMARY KEY ,
    description varchar,
    due_date timestamp,
    done BOOLEAN
);

INSERT INTO todo_items (description, due_date, done) VALUES ('Test', '2024-03-28 12:00', false);

