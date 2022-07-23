import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.logging.Level;
import java.util.logging.Logger;





public class Benutzer {

    static BufferedReader objReader;
    static int iteration = 0;
    static Benutzer alice = new Benutzer("Alice", "ggg");
    static Benutzer Bob = new Benutzer("Bob", "ggg");
    int zeilenanzahl;
    String namebenutzer;
    String schlüssel;

    public Benutzer(String namebenutzer, String schlüssel) {
        this.schlüssel = schlüssel;
        this.namebenutzer = namebenutzer;

    }

    public void initalize() {
        String alles = "";

        try {
            // 
            objReader = new BufferedReader(new FileReader("DataBaseAES.txt"));

            String strCurrentLine;
            while ((strCurrentLine = objReader.readLine()) != null) {
                alles = alles + "" + strCurrentLine + "\n";

            }

        } catch (Exception ex) {
            System.out.println();

        }
        if (alles.contains(this.namebenutzer)) {
            return;
        } else {

        }
    }

    public void generatekey() {

        try (BufferedWriter dateischreiber = new BufferedWriter(new FileWriter(new File("DataBaseAES.txt"), true))) {

            dateischreiber.write(this.namebenutzer + "schlüssel: " + this.schlüssel +" g");

        } catch (Exception ex) {

        }

    }
    public String getkey(){
        // objekt mit dem, um die Zahlen zu bekommen, 
        String benutzer;
        benutzer = this.namebenutzer;
        String b = "";

        try {

            objReader = new BufferedReader(new FileReader("Database.txt"));

            String strCurrentLine;
            while ((strCurrentLine = objReader.readLine()) != null) {
                if (strCurrentLine.contains(benutzer)) {
                    String nurzahlen = strCurrentLine.substring(benutzer.length() + 1);
                     b = nurzahlen.substring(nurzahlen.indexOf("schlüssel:") +10, nurzahlen.indexOf("g") -2);

                }
            }

        } catch (Exception ex) {
        }
        return b;

    }

}
