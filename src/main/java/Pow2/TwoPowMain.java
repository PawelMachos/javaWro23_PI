package Pow2;

public class TwoPowMain {
    public static void main(String[] args) {
        TwoPow twoPow = new TwoPow();
        System.out.println(twoPow.powIter(5));

        TwoPow twoRec = new TwoPow();
        System.out.println(twoPow.powRec(5));
    }
}
