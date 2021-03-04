public class Officer extends Person{

    private int officerID;
    private int crimesSolved;

    public Officer(String name, String surname, int officerID, int crimesSolved) {
        this.officerID = officerID;
        this.crimesSolved = crimesSolved;
        super.setName(name);
        super.setSurname(surname);
    }

    public Officer() {
    }

    public int calculatedLevel() {
        return 0;
    }

    public int getOfficerID() {
        return officerID;
    }

    public void setOfficerID(int officerID) {
        this.officerID = officerID;
    }

    public int getCrimesSolved() {
        return crimesSolved;
    }

    public void setCrimesSolved(int crimesSolved) {
        this.crimesSolved = crimesSolved;
    }

    @Override
    public String toString() {
        return super.getName() + ", " + super.getSurname() + ", " + officerID + ", " + ", " + crimesSolved + ".";
    }
}