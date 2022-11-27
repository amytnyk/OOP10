package org.alexm.task2;

import java.time.LocalDate;

public interface Client {
    String getEmail();
    Country getCountry();
    LocalDate getLastActiveTime();
}
