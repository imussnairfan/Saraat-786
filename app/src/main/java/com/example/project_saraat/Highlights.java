package com.example.project_saraat;

public class Highlights {
    String Main_Heading;
    String Sub_Heading;
    String Highlight;

    public Highlights(String main_Heading, String sub_Heading, String highlight) {
        Main_Heading = main_Heading;
        Sub_Heading = sub_Heading;
        Highlight = highlight;
    }

    public String getMain_Heading() {
        return Main_Heading;
    }

    public void setMain_Heading(String main_Heading) {
        Main_Heading = main_Heading;
    }

    public String getSub_Heading() {
        return Sub_Heading;
    }

    public void setSub_Heading(String sub_Heading) {
        Sub_Heading = sub_Heading;
    }

    public String getHighlight() {
        return Highlight;
    }

    public void setHighlight(String highlight) {
        Highlight = highlight;
    }
}
