package com.example.project_saraat;

public class Concepts {
    String Heading;
    String SubHeading;
    String Details;

    public Concepts(String heading, String subHeading, String details) {
        Heading = heading;
        SubHeading = subHeading;
        Details = details;
    }

    public String getHeading() {
        return Heading;
    }

    public void setHeading(String heading) {
        Heading = heading;
    }

    public String getSubHeading() {
        return SubHeading;
    }

    public void setSubHeading(String subHeading) {
        SubHeading = subHeading;
    }

    public String getDetails() {
        return Details;
    }

    public void setDetails(String details) {
        Details = details;
    }
}
