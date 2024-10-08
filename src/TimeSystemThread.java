import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TimeSystemThread extends Thread {
    /* Have this class extend the Thread class
       The run method should output the current date and time at 10 second intervals
        The method should run indefinitely
     */

    public void run(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now));
    }
}
