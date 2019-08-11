package StopWatch;

public class StopWatchMain extends StopWatch {

    public static void main(String[] args) {

        StopWatch st = new StopWatch();

        st.start();

        System.out.println((st.stop()) + " nanosekund");

    }


}
