import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        // Сначала по фамилии (по алфавиту / возрастанию)
        int lastnameCompare = o1.lastname.compareTo(o2.lastname);
        if (lastnameCompare != 0) {
            return lastnameCompare;
        }
        // Если фамилии одинаковые, то по имени (по алфавиту / возрастанию)
        return o1.firstname.compareTo(o2.firstname);
    }
}
