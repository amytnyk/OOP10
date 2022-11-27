package org.alexm.task2;

import java.time.LocalDate;

public class FacebookClient implements Client {
    private final FacebookUser user;

    public FacebookClient(FacebookUser facebookUser) {
        user = facebookUser;
    }

    @Override
    public String getEmail() {
        return user.getEmail();
    }

    @Override
    public Country getCountry() {
        return user.getUserCountry();
    }

    @Override
    public LocalDate getLastActiveTime() {
        return user.getGetUserActiveTime();
    }
}
