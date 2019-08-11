package Random;

import java.util.Random;
import java.util.Scanner;

public class LosowanieMain {

    private static final int upperBound = 100;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random generator = new Random();
        int randNumber = generator.nextInt(upperBound);

        for (int i = 0; i < 7; ++i) {
            int playerNumber = sc.nextInt();
            if (playerNumber == randNumber) {
                System.out.println("Win!");
                return;
            }
            if (playerNumber < randNumber) {
                System.out.println("Za ma³o!");
            } else {
                System.out.println("Za du¿o!");
            }
        } System.out.println(randNumber);

    }


}
