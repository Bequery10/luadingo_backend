package com.avengers.luadingo.model;

import java.io.Serializable;
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
}