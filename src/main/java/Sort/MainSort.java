package Sort;

public class MainSort {
    public static void main(String[] args) {
        int [] table = new int [] {2, 1, 3, 6, 7, 3};
        BubbleSort bubbleSort = new BubbleSort();
        table = bubbleSort.sort(table);
        for (int n: table)
            System.out.print(n + " ");
    }
}
