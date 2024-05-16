package com.avengers.luadingo.model;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Embeddable;

@Embeddable
public class Has_BadgePK implements Serializable {
    private int badge_id;
    private int username;

    public Has_BadgePK() {
    }

    public int getBadge_id() {
        return badge_id;
    }

    public void setBadge_id(int badge_id) {
        this.badge_id = badge_id;
    }

    public int getUsername() {
        return username;
    }

    public void setUsername(int username) {
        this.username = username;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Has_BadgePK that = (Has_BadgePK) o;
        return badge_id == that.badge_id && username == that.username;
    }

    @Override
    public int hashCode() {
        return Objects.hash(badge_id, username);
    }
}