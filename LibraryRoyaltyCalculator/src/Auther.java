import java.util.ArrayList;

public class Auther {

    private String name;
    private ArrayList<Title> titles;

    public Auther(String name) {
        this.name = name;
        this.titles = new ArrayList<>();
    }

    public void addTitle(Title t) {
        titles.add(t);
    }

    public float calculateTotalPay() {
        float totalPay = 0;

        for (Title t : titles) {

            totalPay += t.calculateRoyalty();
        }
        return totalPay;
    }

    public String getName() {
        return this.name;
    }
}
