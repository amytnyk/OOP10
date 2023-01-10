package org.alexm.task2;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class LoginTest {
    @Test
    void loginWithFacebook() {
        Client client = Login.login(
            "oleksii.mytnyk@ucu.edu.ua",
            Country.Ukraine,
            LocalDate.of(2022, 12, 15),
            "facebook");

        assertEquals(client.getCountry(), Country.Ukraine);
        assertEquals(client.getLastActiveTime(), LocalDate.of(2022, 12, 15));
        assertEquals(client.getEmail(), "oleksii.mytnyk@ucu.edu.ua");
        assertInstanceOf(FacebookClient.class, client);
    }

    @Test
    void loginWithTwitter() {
        Client client = Login.login(
            "oleksii.mytnyk@ucu.edu.ua",
            Country.USA,
            LocalDate.of(2023, 1, 10),
            "twitter");

        assertEquals(client.getCountry(), Country.USA);
        assertEquals(client.getLastActiveTime(), LocalDate.of(2023, 1, 10));
        assertEquals(client.getEmail(), "oleksii.mytnyk@ucu.edu.ua");
        assertInstanceOf(TwitterClient.class, client);
    }

    @Test
    void loginWithInvalidMethod() {
        assertThrows(IllegalArgumentException.class, () -> Login.login(
            "oleksii.mytnyk@ucu.edu.ua",
            Country.USA,
            LocalDate.of(2023, 1, 10),
            "google"));
    }
}