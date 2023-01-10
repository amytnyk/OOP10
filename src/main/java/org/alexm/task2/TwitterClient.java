package org.alexm.task2;

import java.time.LocalDate;

public class TwitterClient implements Client {
    private final TwitterUser user;

    public TwitterClient(TwitterUser twitterUser) {
        user = twitterUser;
    }

    @Override
    public String getEmail() {
        return user.getUserMail();
    }

    @Override
    public Country getCountry() {
        return Country.valueOf(user.getCountry());
    }

    @Override
    public LocalDate getLastActiveTime() {
        return LocalDate.parse(user.getLastActiveTime());
    }
}
