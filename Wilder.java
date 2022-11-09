public class Wilder {
    private String firstname;
    private boolean aware;

    public Wilder(String firstname, boolean aware) {
        this.firstname = firstname;
        this.aware = aware;
    }

    public String getFirstname() {
        return this.firstname;
    }

    public String setFirstname(String firstname) {
        return this.firstname;
    }

    public boolean getAware() {
        return this.aware;
    }

    public boolean setAware(boolean aware) {
        return this.aware;
    }

    public String whoAmI() {
        if (this.getAware()) {
            return "Je m'appelle " + this.getFirstname() + " et je suis aware";
        } else {
            return "Je m'appelle " + this.getFirstname() + " et je ne suis pas aware";
        }
    }
}