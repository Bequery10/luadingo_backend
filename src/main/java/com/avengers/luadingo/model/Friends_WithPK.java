package com.avengers.luadingo.model;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Embeddable;

@Embeddable
public class Friends_WithPK implements Serializable {
    private String username1;
    private String username2;

    public Friends_WithPK() {
    }

    public String getUsername1() {
        return username1;
    }

    public void setUsername1(String username1) {
        this.username1 = username1;
    }

    public String getUsername2() {
        return username2;
    }

    public void setUsername2(String username2) {
        this.username2 = username2;
    }

    @Override
    public int hashCode() {
        return Objects.hash(username1, username2);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Friends_WithPK other = (Friends_WithPK) obj;
        return username1 == other.username1 && username2 == other.username2;
    }
}
