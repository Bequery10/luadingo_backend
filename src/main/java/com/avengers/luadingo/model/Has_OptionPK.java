package com.avengers.luadingo.model;

import java.io.Serializable;
import jakarta.persistence.Embeddable;


public class Has_OptionPK implements Serializable{
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

}
