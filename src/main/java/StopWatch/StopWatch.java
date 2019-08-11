package StopWatch;

public class StopWatch {

    private long startTime;
    private boolean running = false;
    int c = 2;
    int n = 1000;
    int[] tab = new int[n];

    public void start() {
        if (running) return;
        this.startTime = System.nanoTime();
        this.running = true;

        for (int i =0; i < n; i++) {
            tab[i] *= c;
        }
    }


    public long stop() {
        //long stopTime = System.nanoTime();
        if (!running) return -1;
        this.running = false;

        return (System.nanoTime() - startTime);

    }

}
