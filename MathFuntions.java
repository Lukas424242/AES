public class MathFunctions {
// 128 (-0x80) to 127 (0x7f)

    public static String [][][] arraycastit2Array2D2(String eingabe){
        // Dafür sorgen dass text.length() %16 == 0 ist
        while (true) {
            if (MathFunctions.istteilbar(eingabe.length(), 16)) {
                break;
            } else {
                eingabe = eingabe + " ";
            }

        }
        // die Länge des neuen Strings bestimmen
        int anzahlblocke =0;
        anzahlblocke = anzahlblocke /16;
        // Übergabe eines 16 großen Strings, an die Methode, welche das in einem
        // Array returned, wir casten es zu 2d, und dann zu 3d
        
        
        // Split in 16 blöcke
        int start =0;
        int ende =16;
        String[][] ZweiDArray = new String[3][3];
        for(int i=0; i<anzahlblocke;i++){
            String block ="";
          block = eingabe.substring(start, ende);
          String
          
          for(int a=0;a<4;a++){
              
              for(int c=0;a<4;i++){
                  
              }
              
          }
          
          
          
          
          
          
          start = start +16;
          ende = ende +16;
        }
        
        
        
    }
    public static String[][][] arraycastit2Array2D(String eingabe) {
        //128 (-0x80) to 127 (0x7f)
        while (true) {
            if (MathFunctions.istteilbar(eingabe.length(), 16)) {
                break;
            } else {
                eingabe = eingabe + " ";
            }

        }
        String[] hexarray = null;
        hexarray = MathFunctions.cast2hex(eingabe);
        int eingabelänge = 0;

        if (eingabe.length() % 16 >= 0) {
            eingabelänge = eingabelänge + 1;
        } else {

        }
        
        String[][][] zielarray = new String[eingabelänge][3][3]; // nur passend bei exakter blocklänge, modulo

        for (int i = 0; i < eingabelänge; i++) {

            for (int m = 0; m < 4; m++) {
                
                for (int l = 0; l < 4; l++) {

                     zielarray[i][m][l] =   hexarray[i]; 
                }
            }

        }

        return zielarray;
    }

    public static String[] cast2hex(String eingabe) {
        //128 (-0x80) to 127 (0x7f)
        while (true) {
            if (MathFunctions.istteilbar(eingabe.length(), 16)) {
                break;
            } else {
                eingabe = eingabe + " ";
            }

        }

        String[] b3 = new String[eingabe.length() - 1];
        // Erst String in dez, dann in ascii byte, von dort in einen string und den umcasten

        char[] c = new char[eingabe.length() - 1];
        for (int b = 0; b < eingabe.length(); b++) {
            c[b] = eingabe.charAt(b);

        }
        for (int i = 0; i < eingabe.length() - 1; i++) {
            String u;
            u = Integer.toHexString(c[i]);
            b3[i] = u;

        }
        return b3;

    }

    public static boolean istteilbar(int vermeint, int zahl) {
        boolean b = true;
        if (zahl % vermeint == 0) {

        } else {
            b = false;
        }
        return b;
    }

    public static int getlength(long zahl) {
        int length = (int) (Math.log10(zahl) + 1);

        return length;
    }

}

