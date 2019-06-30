package P2;

import java.util.ArrayList;
import java.util.List;

public class Ex01 {

    public static void main(String[] args) {
        final String[] BRANDS = {"Porche", "Mercedes-Benz", "Lexus", "BMW", "Ferrari"};
        final String[] MODELS = {"Camaro", "Benz", "L", "W5", "C90"};
        final double[] PRICES = {700000.00, 800000.00, 560000.00, 780000.00};
        List<Automobile> autoList = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            Automobile auto = new Automobile(BRANDS[i], MODELS[i], PRICES[i]);
            autoList.add(auto);
        }

        autoList.stream().map(Automobile::getPrice).sorted();
        System.out.println(autoList.get(0).getBrand() + " - " + autoList.get(0).getModel() + " - " + autoList.get(0).getPrice());
    }
}
