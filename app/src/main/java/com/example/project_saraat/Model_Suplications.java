package com.example.project_saraat;

public class Model_Suplications {
    String text;
    String decs;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getDecs() {
        return decs;
    }

    public void setDecs(String decs) {
        this.decs = decs;
    }
    public Model_Suplications(String text, String decs) {
        this.text = text;
        this.decs = decs;
    }
}