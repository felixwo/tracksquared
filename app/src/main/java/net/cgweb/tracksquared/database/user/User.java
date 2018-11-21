package net.cgweb.tracksquared.database.user;

import net.cgweb.tracksquared.database.journey.Journey;

public class User {
    private String name;
    private Journey currentJourney;
    private long userSince; //init on first launch

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Journey getCurrentJourney() {
        return currentJourney;
    }

    public void setCurrentJourney(Journey currentJourney) {
        this.currentJourney = currentJourney;
    }

    public long getUserSince() {
        return userSince;
    }

    public void setUserSince(long userSince) {
        this.userSince = userSince;
    }
}