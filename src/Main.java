import java.util.ArrayList;

import static java.util.Arrays.asList;

public class Main {

    public static void main(String[] args) {

        ArrayList<District> districts = new ArrayList<>();

        ArrayList<Officer> officers = new ArrayList<>(asList(
                new Officer("Sam", "Spade", 22890, 75),
                new Officer("Sam2", "Spade2", 22891, 75)
                ));

        districts.add(new District("District9", "Riga", 8, officers));

        officers = new ArrayList<>(asList(
                new Officer("Clarice", "Starling", 22894, 75),
                new Officer("Clarice2", "Starling", 22895, 75),
                new Officer("Clarice3", "Starling", 22136, 5)
        ));

        districts.add(new District("District10", "Sigulda",9,officers));
        districts.get(0).addNewOfficer(new Officer("Added Officer", "Added Starling",
                22894, 75));



        for(District district : districts)
        {
            System.out.println("District Name: " + district.getTitle());
            System.out.println("Count of officer: " + district.getOfficersInTheDistrict().size());

            for (Officer officer : district.getOfficersInTheDistrict())
            {
                System.out.format("Officer name %s and surname %s%n",officer.getName(),officer.getSurname());
            }
        }



    }
}