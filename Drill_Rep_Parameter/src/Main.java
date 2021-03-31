import java.io.*;
import java.time.LocalDateTime;


public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        new Main().write();

    }

    public void write() throws FileNotFoundException {

        Data d = new Data();
        d.readFile();
        LocalDateTime currentTime = LocalDateTime.now();
        double w = d.avgWob();
        double drillingInterval = d.interval();
        /*PrintWriter out = new PrintWriter("raport.txt");
        out.println(currentTime + "\r\n" + "Avarage of WOB: " + w + "\r\n" + "Drilling interval equals: " + drillingInterval);
        out.close();*/


        System.out.println("Avarage of WOB: " + w);
        System.out.println("Drilling interval equals: " + drillingInterval);

    }
}
