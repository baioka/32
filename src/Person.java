import java.util.Arrays;

public class Person implements Comparable<Person> {
    String firstname;
    String lastname;
    int weight;
    int height;

    public Person(String firstname, String lastname, int weight, int height) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.weight = weight;
        this.height = height;
    }

    @Override
    public String toString() {
        return "(" + firstname + "," + lastname + "," + weight + "," + height + ")";
    }

    @Override
    public int compareTo(Person that) {
        // Сначала сравниваем рост по убыванию (поэтому that стоит перед this)
        int heightCompare = Integer.compare(that.height, this.height);
        
        // Если рост разный, возвращаем результат сравнения роста
        if (heightCompare != 0) {
            return heightCompare;
        }
        
        // Если рост одинаковый, сравниваем вес по убыванию
        return Integer.compare(that.weight, this.weight);
    }

    static void main() {
        Person[] persons = {
                new Person("Viktor","Petrov", 77, 173),
                new Person("Amina", "Rahman", 55, 167),
                new Person("Sofia", "Markovic", 60, 166),
                new Person("Mateusz", "Nowak", 69, 160),
                new Person("Timur", "Bekzat", 70, 169),
                new Person("Noor", "Al-Hassan", 120, 200),
                new Person("Daniel", "Kovalenko", 101, 180),
                new Person("Elena", "Smirnova", 65, 175),
                new Person("Arman", "Sadykov", 105, 175),
                new Person("Lucas", "Ferreira", 93, 190)
        };
        System.out.println(Arrays.toString(persons));
    }
}
