import java.util.Collections;
import java.util.List;

/**
 * Created by janak on 5/5/17.
 */
public class Calculator {

    public void calculateMin(List<Integer> numList) {
        printInputNumbers(numList, "min");
        System.out.println("The min is " + Collections.min(numList));
    }

    public void calculateMax(List<Integer> numList) {
        printInputNumbers(numList, "max");
        System.out.println("The max is " + Collections.max(numList));
    }

    private void printInputNumbers(List<Integer> numList, String minMax) {
        System.out.print("Calculate " + minMax);
        for (Integer num :
                numList) {
            System.out.print(" " + num);
        }
        System.out.println("");
    }

}
