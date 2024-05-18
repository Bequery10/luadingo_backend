package com.avengers.luadingo.model;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Embeddable;

@Embeddable
public class Has_OptionsPK implements Serializable {
    private int question_id;
    private String option;

    public Has_OptionsPK() {
    }

    public Has_OptionsPK(int question_id, String option) {
        this.question_id = question_id;
        this.option = option;
    }

    public int getQuestion_id() {
        return question_id;
    }

    public void setQuestion_id(int question_id) {
        this.question_id = question_id;
    }

    public String getOption() {
        return option;
    }

    public void setOption(String option) {
        this.option = option;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Has_OptionsPK that = (Has_OptionsPK) o;
        return question_id == that.question_id && option == that.option;
    }

    @Override
    public int hashCode() {
        return Objects.hash(question_id, option);
    }
}
