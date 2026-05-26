import java.util.Comparator;
import java.util.Arrays;

public class AdvancedSort {

    public static <E extends Comparable<E>> void sort(E[] list) {
        if (list == null || list.length <= 1) {
            return;
        }
        mergeSort(list, 0, list.length - 1);
    }

    private static <E extends Comparable<E>> void mergeSort(E[] list, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            mergeSort(list, left, mid);
            mergeSort(list, mid + 1, right);
            merge(list, left, mid, right);
        }
    }

    private static <E extends Comparable<E>> void merge(E[] list, int left, int mid, int right) {
        E[] leftArray = Arrays.copyOfRange(list, left, mid + 1);
        E[] rightArray = Arrays.copyOfRange(list, mid + 1, right + 1);

        int i = 0, j = 0, k = left;

        while (i < leftArray.length && j < rightArray.length) {
            if (leftArray[i].compareTo(rightArray[j]) <= 0) {
                list[k++] = leftArray[i++];
            } else {
                list[k++] = rightArray[j++];
            }
        }

        while (i < leftArray.length) {
            list[k++] = leftArray[i++];
        }
        while (j < rightArray.length) {
            list[k++] = rightArray[j++];
        }
    }

    public static <E> void sort(E[] list, Comparator<? super E> comparator) {
        if (list == null || list.length <= 1) {
            return;
        }
        mergeSort(list, 0, list.length - 1, comparator);
    }

    private static <E> void mergeSort(E[] list, int left, int right, Comparator<? super E> comparator) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            mergeSort(list, left, mid, comparator);
            mergeSort(list, mid + 1, right, comparator);
            merge(list, left, mid, right, comparator);
        }
    }

    private static <E> void merge(E[] list, int left, int mid, int right, Comparator<? super E> comparator) {
        E[] leftArray = Arrays.copyOfRange(list, left, mid + 1);
        E[] rightArray = Arrays.copyOfRange(list, mid + 1, right + 1);

        int i = 0, j = 0, k = left;

        while (i < leftArray.length && j < rightArray.length) {
            if (comparator.compare(leftArray[i], rightArray[j]) <= 0) {
                list[k++] = leftArray[i++];
            } else {
                list[k++] = rightArray[j++];
            }
        }

        while (i < leftArray.length) {
            list[k++] = leftArray[i++];
        }
        while (j < rightArray.length) {
            list[k++] = rightArray[j++];
        }
    }

    public static <E extends Comparable<E>> E findMin(E[] list) {
        int minIndex = 0;
        for (int i = 1; i < list.length; i++) {
            if (list[i].compareTo(list[minIndex]) < 0) {
                minIndex = i;
            }
        }
        return list[minIndex];
    }

    public static <E> E findMin(E[] list, Comparator<? super E> comparator) {
        int minIndex = 0;
        for (int i = 1; i < list.length; i++) {
            if (comparator.compare(list[i], list[minIndex]) < 0) {
                minIndex = i;
            }
        }
        return list[minIndex];
    }

    static void main() {
        String[] names = {"Bob", "John", "Alice"};
        System.out.println(findMin(names)); 
        System.out.println(findMin(names, new StringComparator())); 
    }
}
