package com.avengers.luadingo.model;

import java.io.Serializable;
import jakarta.persistence.Embeddable;


@Embeddable
public class Friends_WithPK implements Serializable {
    private int username1;
    private int username2;

    public Friends_WithPK() {
    }

    public int getUsername1() {
        return username1;
    }

    public void setUsername1(int username1) {
        this.username1 = username1;
    }

    public int getUsername2() {
        return username2;
    }

    public void setUsername2(int username2) {
        this.username2 = username2;
    }

}
