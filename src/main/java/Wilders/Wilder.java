package Wilders;

public class Wilder {
    private String firstName;
    private boolean present;

    public Wilder(String firstName, boolean present) {
        this.firstName = firstName;
        this.present = present;
    }

    public String getFirsName() {
        return this.firstName;
    }
    public boolean isPresent() {
        return this.present;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setPresent(boolean present) {
        this.present = present;
    }

    public String woIam() {
        if(isPresent()) {
            return "My name is " + getFirsName() + " and I am present";
        } else {
            return "My name is " + getFirsName() + " and I am not present";
        }
    }
}
