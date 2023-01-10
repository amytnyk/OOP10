package org.alexm.task1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {
    private static Database database;
    private final Connection connection;

    private Database() throws SQLException {
        connection = DriverManager.getConnection("jdbc:sqlite:db.sqlite");

        createUserTable();
    }

    private void createUserTable() throws SQLException {
        Statement stmt = connection.createStatement();
        String query = """
            create table if not exists user
            (
                id    integer primary key autoincrement,
                name  text,
                email text,
                age   integer
            );""";
        stmt.executeUpdate(query);
        stmt.close();
    }

    public void executeQuery(String query) throws SQLException {
        Statement statement = connection.createStatement();
        statement.executeUpdate(query);
        statement.close();
    }

    public static Database getInstance() throws SQLException {
        if (database == null)
            database = new Database();
        return database;
    }
}
