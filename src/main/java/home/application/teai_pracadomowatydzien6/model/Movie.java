package home.application.teai_pracadomowatydzien6.model;

public class Movie {

    private String name;
    private String dateOfProduction;
    private String direction;

    public Movie(String name, String dateOfProduction, String direction) {
        this.name = name;
        this.dateOfProduction = dateOfProduction;
        this.direction = direction;
    }

    public Movie() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfProduction() {
        return dateOfProduction;
    }

    public void setDateOfProduction(String dateOfProduction) {
        this.dateOfProduction = dateOfProduction;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }
}
