package zakerby.pitchgithubactions.model;

public class Programmer extends Person {
    private String favouriteProgrammingLanguage;

    public Programmer() {
    }

    public Programmer(String givenName, String surname, String favouriteProgrammingLanguage) {
        super(givenName, surname);
        this.favouriteProgrammingLanguage = favouriteProgrammingLanguage;
    }

    public String getFavouriteProgrammingLanguage() {
        return favouriteProgrammingLanguage;
    }

    public void setFavouriteProgrammingLanguage(String favouriteProgrammingLanguage) {
        this.favouriteProgrammingLanguage = favouriteProgrammingLanguage;
    }

    @Override
    public String toString() {
        return super.toString() + " likes to program in " + favouriteProgrammingLanguage;
    }
}