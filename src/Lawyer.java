public class Lawyer extends Person {

    private int lawyerId;
    private int helpedInCrimeSolving;

    public Lawyer(String name, String surname, int lawyerId, int helpedInCrimeSolving) {
        this.lawyerId = lawyerId;
        this.helpedInCrimeSolving = helpedInCrimeSolving;
        super.setName(name);
        super.setSurname(surname);
    }

    public Lawyer()
    {

    }

    public int getLawyerId() {
        return lawyerId;
    }

    public void setLawyerId(int lawyerId) {
        this.lawyerId = lawyerId;
    }

    public int getHelpedInCrimeSolving() {
        return helpedInCrimeSolving;
    }

    public void setHelpedInCrimeSolving(int helpedInCrimeSolving) {
        this.helpedInCrimeSolving = helpedInCrimeSolving;
    }

    @Override
    public String toString() {
        return super.getName() + " " + super.getSurname() + " " + lawyerId + " " + helpedInCrimeSolving;
    }
}
