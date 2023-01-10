package org.alexm.task1;

import org.junit.jupiter.api.Test;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    @Test
    void user() throws SQLException {
        User alex = new User("Alex Mytnyk", "oleksii.mytnyk@ucu.edu.ua", 18);
        alex.save();
        assertEquals(alex.getAge(), 18);
        assertEquals(alex.getEmail(), "oleksii.mytnyk@ucu.edu.ua");
        assertEquals(alex.getName(), "Alex Mytnyk");
    }
}