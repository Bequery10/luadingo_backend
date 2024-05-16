package com.avengers.luadingo.model;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Embeddable;

public class Has_OptionPK implements Serializable {
    private int question_id;
    private int option;

    public Has_OptionPK() {
    }

    public Has_OptionPK(int question_id, int option) {
        this.question_id = question_id;
        this.option = option;
    }

    public int getQuestion_id() {
        return question_id;
    }

    public void setQuestion_id(int question_id) {
        this.question_id = question_id;
    }

    public int getOption() {
        return option;
    }

    public void setOption(int option) {
        this.option = option;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Has_OptionPK that = (Has_OptionPK) o;
        return question_id == that.question_id && option == that.option;
    }

    @Override
    public int hashCode() {
        return Objects.hash(question_id, option);
    }
}
