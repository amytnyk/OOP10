package org.alexm.task3;

public class Database extends БазаДаних {
    public String receiveUserData() {
        return super.отриматиДаніКористувача();
    }

    public String receiveStatisticData() {
        return super.отриматиСтатистичніДані();
    }
}
