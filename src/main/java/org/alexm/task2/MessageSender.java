package org.alexm.task2;

import java.time.LocalDate;
import java.time.Period;

public class MessageSender {
    public static void send(String text, Client user, Country country) {
        if (user.getCountry() == Country.Ukraine &&
                Period.between(user.getLastActiveTime(), LocalDate.now()).getDays() < 2)
            System.out.println("Sending to " + user.getEmail() + ": " + text);
    }
}
