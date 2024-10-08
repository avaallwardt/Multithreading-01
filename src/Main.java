import java.util.Scanner;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        /*
            You will see two empty methods below. Both will, functionally, perform the same actions.
            The first will have you utilize the TimeSystemThread class whereas the second will require you
            to use the TimeSystemRunnable class.

            The method(s) should do the following:
                • Begin a thread outputting current date/time
                • Welcome the user and ask them for their name
                • Take in their name, then output it back.
                     • During this time, the other thread should continuously be outputting the date/time
                       in five second intervals as defined within the method.
         */

        //threadTask();
        //runnableTask();
    }

    public static void threadTask() {
        TimeSystemThread thread = new TimeSystemThread();
        // .start() causes run to start

        ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
        executor.scheduleAtFixedRate(thread, 0, 10, TimeUnit.SECONDS); // will run the run method of thread

        System.out.println("What is your name?");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println("Your name is: " + input);

    }

    public static void runnableTask() {
        TimeSystemRunnable runnable = new TimeSystemRunnable();

        ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
        executor.scheduleAtFixedRate(runnable, 0, 10, TimeUnit.SECONDS);

        System.out.println("What is your name?");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println("Your name is: " + input);

    }
}