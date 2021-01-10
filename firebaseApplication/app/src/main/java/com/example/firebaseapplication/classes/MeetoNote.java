package com.example.firebaseapplication.classes;

import java.io.Serializable;

public class MeetoNote  implements Serializable {
    private String note;
    private String date;
    private String feeling;

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getFeeling() {
        return feeling;
    }

    public void setFeeling(String feeling) {
        this.feeling = feeling;
    }

    public MeetoNote(String note, String date, String feeling) {
        this.note = note;
        this.date = date;
        this.feeling = feeling;
    }

}
