package com.avengers.luadingo.model;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Embeddable;

@Embeddable
public class Has_OptionsPK implements Serializable {
    private int question_id;
    private String choice;

    public Has_OptionsPK() {
    }

    public Has_OptionsPK(int question_id, String choice) {
        this.question_id = question_id;
        this.choice = choice;
    }

    public int getQuestion_id() {
        return question_id;
    }

    public void setQuestion_id(int question_id) {
        this.question_id = question_id;
    }

    public String getChoice() {
        return choice;
    }

    public void setChoice(String choice) {
        this.choice = choice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Has_OptionsPK that = (Has_OptionsPK) o;
        return question_id == that.question_id && choice == that.choice;
    }

    @Override
    public int hashCode() {
        return Objects.hash(question_id, choice);
    }
}
