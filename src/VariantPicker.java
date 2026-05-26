import java.util.Random;

public class VariantPicker {
    static String[] sorts = {"heap", "merge", "quick-pivot-first-element", "quick-pivot-last-element", "quick-pivot-middle-element"};
    static String [] custom = {
            "by (firstname-alphabetical-ascending,lastname-alphabetical-ascending)",
            "by (lastname-alphabetical-ascending,firstname-alphabetical-ascending)"
    };
    static String [] natural = {
            "by (height-descending, weight-descending)",
            "by (weight-descending, height-descending)"};

    static void printVariant(long seed){
        Random rand = new Random(seed+7);
        System.out.println("Your Variant");
        System.out.println();
        System.out.println(sorts[rand.nextInt(0,sorts.length-1)]); // Elementary sort
        System.out.println(natural[rand.nextInt(0,natural.length-1)]); // Natural order
        System.out.println(custom[rand.nextInt(0,custom.length-1)]); // Custom order
    }

    static void main() {
        long id = 250000; // substitute your id here
        printVariant(id);
    }
}
