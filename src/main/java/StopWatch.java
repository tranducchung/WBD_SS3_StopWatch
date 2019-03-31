
import java.util.Scanner;

public class StopWatch {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        int choise;
        do {
            System.out.println("1.startTime");
            System.out.println("2.endTime");
            System.out.println("3.ElapsedTime");
            System.out.println("0.Exit");
            Scanner scanner = new Scanner(System.in);
            choise = scanner.nextInt();
            switch (choise){
                case 1:
                    stopWatch.Start();
                    System.out.println("Start time is " + stopWatch.getStartTime());
                    break;
                case  2:
                    stopWatch.stop();
                    System.out.println("End time is " + stopWatch.getEndTime());
                    break;
                case 3:
                    System.out.println("ElapsedTime is " + stopWatch.getElapsedTime());
            }
        } while (choise != 0);
    }

    private long startTime;
    private long endTime;


    private long getStartTime() {
        return startTime;
    }

    private long getEndTime() {
        return endTime;
    }

    private StopWatch() {
    }

    private void Start() {
        startTime = System.currentTimeMillis();
    }

    private void stop() {
        endTime = System.currentTimeMillis();
    }

    private long getElapsedTime() {
        long result;
        result = this.endTime - this.startTime;
        return result;
    }
}
