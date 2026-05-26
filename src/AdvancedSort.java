import java.util.Comparator;

public class AdvancedSort {
    // bubble sort variant
    public static <E extends Comparable<E>> void sort(E[] list){
        // implement it according to your variant
    }

    public static <E> void sort(E[] list, Comparator<? super E> comparator) {
        // implement it according to your variant
    }

    // Example for Comparable usage
    public static <E extends Comparable<E>> E findMin(E[] list){
        int minIndex = 0;
        for (int i = 1; i < list.length; i++) {
            if  (list[i].compareTo(list[minIndex]) < 0) {
                minIndex = i;
            }
        }
        return list[minIndex];
    }

    // Example for Comparator usage
    public static <E> E findMin(E[] list, Comparator<? super E> comparator) {
        int minIndex = 0;
        for (int i = 1; i < list.length; i++) {
            if  (comparator.compare(list[i],list[minIndex]) < 0) {
                minIndex = i;
            }
        }
        return list[minIndex];
    }

    static void main() {
        String [] names = {"Bob", "John", "Alice"};
        
        //Comparable used
        System.out.println(findMin(names)); // Alice (smallest by alphabet, natural)
        
        // Comparator used
        System.out.println(findMin(names, new StringComparator())); // Bob (smallest by length, custom)
    }
}

