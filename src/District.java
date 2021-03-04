import java.util.ArrayList;

public class District {

    private String title;
    private String city;
    private int districtId;
    private ArrayList<Person> personsInTheDistrict = new ArrayList<>();

    public District() {
    }

    public District(String title, String city, int districtId)
    {
        this.title = title;
        this.city = city;
        this.districtId = districtId;
    }

    public boolean addNewPerson(Person person)
    {
        if(person != null) {
            personsInTheDistrict.add(person);
            return true;
        }
        return false;
    }

    public boolean removePerson(String name, String surname)
    {
        if(!name.isEmpty() && !surname.isEmpty()) {
            personsInTheDistrict.removeIf(person -> person.getName().equals(name)
                    && person.getSurname().equals(surname));
            return true;

        }
        return false;
    }

    public int getDistrictId() {
        return districtId;
    }

    public void setDistrictId(int districtId) {
        this.districtId = districtId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return title + " "+ city + " " + districtId + " " + personsInTheDistrict;
    }
}
