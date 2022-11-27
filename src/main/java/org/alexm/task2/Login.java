package org.alexm.task2;

import java.time.LocalDate;

public class Login {
    public static Client login(String email, Country country, LocalDate lastActivityTime, String loginMethod) {
        if (loginMethod.equals("facebook"))
            return new FacebookClient(new FacebookUser(email, country, lastActivityTime));
        else if (loginMethod.equals("twitter"))
            return new TwitterClient(new TwitterUser(email, country.toString(), lastActivityTime.toString()));
        else
            throw new IllegalArgumentException("No such login method");
    }
}
