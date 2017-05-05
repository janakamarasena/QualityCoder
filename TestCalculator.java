import java.util.ArrayList;

/**
 * Created by janak on 5/5/17.
 */
public class TestCalculator {
    public static void main(String[] args) {

        ArrayList<Integer> minList = new ArrayList<>();
        minList.add(53);
        minList.add(23);
        minList.add(124);
        minList.add(53);
        minList.add(44);
        minList.add(32);
        minList.add(53);
        minList.add(12);
        minList.add(34);
        minList.add(54);

        ArrayList<Integer> maxList = new ArrayList<>();
        maxList.add(87);
        maxList.add(67);
        maxList.add(89);
        maxList.add(76);
        maxList.add(45);
        maxList.add(23);
        maxList.add(90);
        maxList.add(89);
        maxList.add(67);
        maxList.add(78);

        Calculator calc = new Calculator();
        calc.calculateMin(minList);
        calc.calculateMax(maxList);


    }
}
