
import java.io.BufferedReader;


public class AES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String eingabe = "abcdefghijklmnop";
        //System.out.println(eingabe.length());
        String[][][] v = null;
        //v = MathFunctions.arraycastit2Array3D(eingabe);

        for (int i = 0; i < 1; i++) {

            for (int j = 0; j < 4; j++) {
                for (int l = 0; l < 4; l++) {
                    //System.out.println(v[i][j][l]);
                    //System.out.println("i,j,l: "+  i + j + l);
                }
            }
        }

        //System.out.println(Encry.replacehexENCRY("3b"));
        String[][] b = {{"1", "2", "3", "4"},
        {"5", "6", "7", "8"},
        {"9", "10", "11", "12"},
        {"13", "14", "15", "16"}};

        Encry.shiftrows(b);
        System.out.println(print2D(Encry.shiftrows(b)));

        String[][] binv = {{"2", "3", "4", "1"},
        {"6", "7", "8", "5"},
        {"10", "11", "12", "9"},
        {"14", "15", "16", "13"}};
        //System.out.println(print2D(Decry.shiftrowsinv(binv)));
        Benutzer.Bob.initalize();
        
    }

    public static String[][] print2D(String[][] feld) {
        String[][] neuesArray = null;
        System.out.print("{");

        for (int i = 0; i < feld.length; i++) {

            for (int j = 0; j < feld[i].length; j++) {
                System.out.print(feld[i][j]);
                if (i == feld.length - 1 && j == feld[i].length - 1) {
                    System.out.print("");
                } else {
                    System.out.print(", ");
                }

            }

        }
        System.out.print("}");

        return neuesArray;
    }

}
