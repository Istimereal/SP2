import java.util.ArrayList;

public class LibraryRoyaltyCalculator {


    public static void main(String[] args) {

        Auther auther1 = new Auther("Stephen King");

    // ArrayList<Title> titles = new ArrayList<>();
// PrintedBook("Dark Tower", "Fiction", 20, 600);

    PrintedBook printedBookStephen1 = new PrintedBook
            ("Dark Tower", "SKØN", 20, 600);
    PrintedBook printedBookStephen2 = new PrintedBook
            ("Dark Tower 2", "TE", 15, 75);
    AudioBook audioBookStephen1 = new AudioBook
            ("Dark Tower 3", "SKØN", 5, 1020);

    auther1.addTitle(printedBookStephen1);
    auther1.addTitle(printedBookStephen2);
    auther1.addTitle(audioBookStephen1);
    auther1.addTitle(new AudioBook("Dark Tower5", "SKØN", 22, 522));

    auther1.calculateTotalPay();

        System.out.println(auther1.getName() + ": " + auther1.calculateTotalPay() + " Kr.");

    }
}
