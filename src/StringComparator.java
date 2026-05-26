import java.util.Comparator;

// Example for Comparator implementation: custom comparator for String class
public class StringComparator implements Comparator<String> {
    @Override
    public int compare(String s1, String s2) {
        return s1.length() - s2.length();
    }
}
