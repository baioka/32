import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        int lastnameCompare = o1.lastname.compareTo(o2.lastname);
        if (lastnameCompare != 0) {
            return lastnameCompare;
        }
        return o1.firstname.compareTo(o2.firstname);
    }
}
