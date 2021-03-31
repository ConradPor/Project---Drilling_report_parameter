import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;


public class Data {

    ArrayList<Parameter> parameters = new ArrayList<Parameter>();

    /*public static void main(String[] args) {

        new Data().write();

    }

    public void write() {
        readFile();
        double w = avgWob();
        double drillingInterval = interval();
        System.out.println("Avarage of WOB: " + w);
        System.out.println("Drilling interval equals: " + drillingInterval);

    }*/


    public void readFile() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("./test.csv"));
            br.readLine();
            String line = null;
            while ((line = br.readLine()) != null) {
                readLine(line);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    void readLine(String lineToRead) {
        String[] metadata = lineToRead.split(",");
        String depth = metadata[0];
        String headerTwo = metadata[1];
        String headerThree = metadata[2];
        String headerFour = metadata[3];
        String headerFive = metadata[4];
        Parameter nextParameter = new Parameter(depth, headerTwo, headerThree, headerFour, headerFive);
        parameters.add(nextParameter);
    }


    public double avgWob() {
        double sum = 0;
        ArrayList<String> tempWob = new ArrayList<String>();
        for (Parameter p : parameters) {
            double doth = Double.parseDouble(p.getHeaderTwo());
            tempWob.add(p.getHeaderTwo());
            sum = sum + doth;
        }
        return sum / tempWob.size();
    }


    public double interval() {
        double interval = 0;
        String min = null;
        String max = null;
        ArrayList<String> tempdepth = new ArrayList<String>();
        for (Parameter p : parameters) {
            tempdepth.add(p.getDepth());
            min = tempdepth.get(0);
            max = tempdepth.get(tempdepth.size() -1);
        }
        interval = ((Double.parseDouble(max)) - (Double.parseDouble(min)));
        return interval;
    }
}


