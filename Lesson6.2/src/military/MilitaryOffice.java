package military;

import com.home.military.exceptions.MilitaryUnitIsFullException;
import com.home.military.model.Address;
import com.home.military.model.Person;

import java.util.LinkedList;
import java.util.List;

import static com.home.military.model.Person.MALE;

public class MilitaryOffice {
    private final PersonRegistry registry;
    private final MilitaryUnit[] units;

    public MilitaryOffice(PersonRegistry registry, MilitaryUnit[] units) {
        this.registry = registry;
        this.units = units;
    }

    public List<Person> getFitPeople(Address address) {
        List<Person> peopleByAddress = registry.getPeople(address);
        List<Person> fitPeople = new LinkedList<>();
        for (Person person : peopleByAddress) {
            if (isPersonFit(person)) {
                System.out.printf("%s is fit!\n", person.getName()); // this is equal to System.out.println(person.getName() + " is fit!");
                fitPeople.add(person);
            }
        }
        return fitPeople;
    }

    public void addFitPeopleToTheUnits(Address address) {
        List<Person> fitPeople = getFitPeople(address);
        int unitIndex = 0;
        MilitaryUnit unit;
        for (Person person : fitPeople) {
            boolean personSentToUnit;
            do {
                unit = units[unitIndex];

                try {
//                  personSentToUnit = unit.addRecruitToList(person);
                    personSentToUnit = unit.addRecruitToArray(person);
                } catch (MilitaryUnitIsFullException e) {
                    e.printStackTrace();
                    personSentToUnit = false;
                    unitIndex++;
                }
                //unit is full, try next one

            } while (!personSentToUnit && unitIndex < units.length);
            if (unitIndex == units.length) {
                System.out.println("All units are full");
                return;
            }
        }
    }

    public int getCapacity() {
        int sum = 0;
        for (MilitaryUnit unit : units) {
//            sum += unit.getFreePlaces();
            sum += unit.getFreePlacesFromArray();
        }
        return sum;
    }

    private boolean isPersonFit(Person person) {
        return MALE.equals(person.getSex())
                && person.getAge() > 17
                && person.getAge() < 28;
    }
}
