package org.alexm.task1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.sql.SQLException;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class User {
    private String name;
    private String email;
    private int age;

    public void save() throws SQLException {
        Database.getInstance().executeQuery(
                String.format("INSERT INTO user (email, name, age) VALUES ('%s', '%s', %d);",
                email, name, age));
    }
}
