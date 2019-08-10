package PrimeNumbers;

import java.util.List;

public class PrimeMain {
    public static void main(String[] args) {
        PrimeCalculator primeCalculator = new PrimeCalculator();
        System.out.println(primeCalculator.isPrime(5));
        System.out.println(primeCalculator.isPrime(12));
        System.out.println(primeCalculator.isPrime(37));
        List<Integer> list = primeCalculator.getPrimeNumbers(10);
        for (int i : list) {
            System.out.println(i + " ");
        }

    }
}
