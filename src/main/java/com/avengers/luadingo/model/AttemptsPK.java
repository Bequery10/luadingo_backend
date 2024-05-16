package com.avengers.luadingo.model;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Embeddable;

@Embeddable
public class AttemptsPK implements Serializable {

    private int username;
    private int quiz_id;
    private int attempt_id;

    public AttemptsPK() {
    }

    public AttemptsPK(int username, int quiz_id, int attempt_id) {
        this.username = username;
        this.quiz_id = quiz_id;
        this.attempt_id = attempt_id;
    }

    public int getUsername() {
        return username;
    }

    public void setUsername(int username) {
        this.username = username;
    }

    public int getQuiz_id() {
        return quiz_id;
    }

    public void setQuiz_id(int quiz_id) {
        this.quiz_id = quiz_id;
    }

    public int getAttempt_id() {
        return attempt_id;
    }

    public void setAttempt_id(int attempt_id) {
        this.attempt_id = attempt_id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        AttemptsPK that = (AttemptsPK) o;
        return quiz_id == that.quiz_id && attempt_id == that.attempt_id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, quiz_id, attempt_id);
    }

}
