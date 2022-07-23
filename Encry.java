public class Encry {

    public static String encry(String text, String schlüsssel, Benutzer name) {
        String b = "";
        if (schlüsssel.length() != 16) {
            System.out.println("Zu langer Schlüssel");
        }

        return b;
    }

    public static String[][] encryBlock() {
        String[][] c = null;
        return c;

    }

    public static String[][] replacehexENCRY(String[][] eingabe) {
        // SBox implementieren
        String[][] sbox = {
            {"63", "1 1"}, {"7c", "1 2"}, {"77", "1 3"}, {"7b", "1 4"}, {"f2", "1 5"}, {"6b", "1 6"},
            {"6f", "1 7"}, {"c5", "1 8"}, {"30", "1 9"}, {"01", "1 10"}, {"67", "1 11"}, {"2b", "1 12"},
            {"fe", "1 13"}, {"d7", "1 14"}, {"ab", "1 15"}, {"76", "1 16"}, {"ca", "2 1"}, {"82", "2 2"}, {"c9", "2 3"}, {"7d", "2 4"}, {"fa", "2 5"}, {"59", "2 6"}, {"47", "2 7"}, {"f0", "2 8"},
            {"ad", "2 9"}, {"d4", "2 10"}, {"a2", "2 11"}, {"af", "2 12"}, {"9c", "2 13"}, {"a4", "2 14"},
            {"72", "2 15"}, {"c0", "2 16"}, {"b7", "3 1"}, {"fd", "3 2"}, {"93", "3 3"}, {"26", "3 4"}, {"36", "3 5"}, {"3f", "3 6"}, {"f7", "3 7"}, {"cc", "3 8"}, {"34", "3 9"}, {"a5", "3 10"}, {"e5", "3 11"}, {"f1", "3 12"},
            {"71", "3 13"}, {"d8", "3 14"}, {"31", "3 15"}, {"15", "3 16"}, {"04", "4 1"}, {"c7", "4 2"},
            {"23", "4 3"}, {"c3", "4 4"}, {"18", "4 5"}, {"96", "4 6"}, {"05", "4 7"}, {"9a", "4 8"},
            {"07", "4 9"}, {"12", "4 10"}, {"80", "4 11"}, {"e2", "4 12"}, {"eb", "4 13"}, {"27", "4 14"}, {"b2", "4 15"}, {"75", "4 16"}, {"09", "5 1"}, {"83", "5 2"}, {"2c", "5 3"}, {"1a", "5 4"},
            {"1b", "5 5"}, {"6e", "5 6"}, {"5a", "5 7"}, {"a0", "5 8"}, {"52", "5 9"}, {"3b", "5 10"},
            {"d6", "5 11"}, {"b3", "5 12"}, {"29", "5 13"}, {"e3", "5 14"}, {"2f", "5 15"}, {"84", "5 16"},
            {"53", "6 1"}, {"d1", "6 2"}, {"00", "6 3"}, {"ed", "6 4"}, {"20", "6 5"}, {"fc", "6 6"},
            {"b1", "6 7"}, {"5b", "6 8"}, {"6a", "6 9"}, {"cb", "6 10"}, {"be", "6 11"}, {"39", "6 12"},
            {"4a", "6 13"}, {"4c", "6 14"}, {"58", "6 15"}, {"cf", "6 16"}, {"d0", "7 1"}, {"ef", "7 2"},
            {"aa", "7 3"}, {"fb", "7 4"}, {"43", "7 5"}, {"4d", "7 6"}, {"33", "7 7"}, {"85", "7 8"}, {"45", "7 9"},
            {"f9", "7 10"}, {"02", "7 11"}, {"7f", "7 12"}, {"50", "7 13"}, {"3c", "7 14"}, {"9f", "7 15"},
            {"a8", "7 16"}, {"51", "8 1"}, {"a3", "8 2"}, {"40", "8 3"}, {"8f", "8 4"}, {"92", "8 5"}, {"9d", "8 6"},
            {"38", "8 7"}, {"f5", "8 8"}, {"bc", "8 9"}, {"b6", "8 10"}, {"da", "8 11"}, {"21", "8 12"},
            {"10", "8 13"}, {"ff", "8 14"}, {"f3", "8 15"}, {"d2", "8 16"}, {"cd", "9 1"}, {"0c", "9 2"},
            {"13", "9 3"}, {"ec", "9 4"}, {"5f", "9 5"}, {"97", "9 6"}, {"44", "9 7"}, {"17", "9 8"}, {"c4", "9 9"},
            {"a7", "9 10"}, {"7e", "9 11"}, {"3d", "9 12"}, {"64", "9 13"}, {"5d", "9 14"}, {"19", "9 15"},
            {"73", "9 16"}, {"60", "10 1"}, {"81", "10 2"}, {"4f", "10 3"}, {"dc", "10 4"}, {"22", "10 5"},
            {"2a", "10 6"}, {"90", "10 7"}, {"88", "10 8"}, {"46", "10 9"}, {"ee", "10 10"}, {"b8", "10 11"},
            {"14", "10 12"}, {"de", "10 13"}, {"5e", "10 14"}, {"0b", "10 15"}, {"db", "10 16"}, {"e0", "11 1"},
            {"32", "11 2"}, {"3a", "11 3"}, {"0a", "11 4"}, {"49", "11 5"}, {"06", "11 6"}, {"24", "11 7"},
            {"5c", "11 8"}, {"c2", "11 9"}, {"d3", "11 10"}, {"ac", "11 11"}, {"62", "11 12"}, {"91", "11 13"},
            {"95", "11 14"}, {"e4", "11 15"}, {"79", "11 16"}, {"e7", "12 1"}, {"c8", "12 2"}, {"37", "12 3"},
            {"6d", "12 4"}, {"8d", "12 5"}, {"d5", "12 6"}, {"4e", "12 7"}, {"a9", "12 8"}, {"6c", "12 9"},
            {"56", "12 10"}, {"f4", "12 11"}, {"ea", "12 12"}, {"65", "12 13"}, {"7a", "12 14"}, {"ae", "12 15"},
            {"08", "12 16"}, {"ba", "13 1"}, {"78", "13 2"}, {"25", "13 3"}, {"2e", "13 4"}, {"1c", "13 5"},
            {"a6", "13 6"}, {"b4", "13 7"}, {"c6", "13 8"}, {"e8", "13 9"}, {"dd", "13 10"}, {"74", "13 11"},
            {"1f", "13 12"}, {"4b", "13 13"}, {"bd", "13 14"}, {"8b", "13 15"}, {"8a", "13 16"}, {"70", "14 1"},
            {"3e", "14 2"}, {"b5", "14 3"}, {"66", "14 4"}, {"48", "14 5"}, {"03", "14 6"}, {"f6", "14 7"},
            {"0e", "14 8"}, {"61", "14 9"}, {"35", "14 10"}, {"57", "14 11"}, {"b9", "14 12"}, {"86", "14 13"},
            {"c1", "14 14"}, {"1d", "14 15"}, {"9e", "14 16"}, {"e1", "15 1"}, {"f8", "15 2"}, {"98", "15 3"},
            {"11", "15 4"}, {"69", "15 5"}, {"d9", "15 6"}, {"8e", "15 7"}, {"94", "15 8"}, {"9b", "15 9"},
            {"1e", "15 10"}, {"87", "15 11"}, {"e9", "15 12"}, {"ce", "15 13"}, {"55", "15 14"}, {"28", "15 15"},
            {"df", "15 16"}, {"8c", "16 1"}, {"a1", "16 2"}, {"89", "16 3"}, {"0d", "16 4"}, {"bf", "16 5"},
            {"e6", "16 6"}, {"42", "16 7"}, {"68", "16 8"}, {"41", "16 9"}, {"99", "16 10"}, {"2d", "16 11"},
            {"0f", "16 12"}, {"b0", "16 13"}, {"54", "16 14"}, {"bb", "16 15"}, {"16", "16 16"}};

        String[] reihey = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9",
            "A", "B", "C", "D", "E", "F"};

        String[] reihex = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9",
            "A", "B", "C", "D", "E", "F"};
        String[][] resultset = new String[4][4];

        for (int k = 0; k < 4; k++) {

            for (int z = 0; z < 4; z++) {
                String n = eingabe[k][z];

                String a = "" + n.charAt(0); // y buchstabe
                String b = "" + n.charAt(1); // x buchstabe
                String koordinaten = "";
                for (int i = 0; i < reihey.length; i++) {
                    if (a.equalsIgnoreCase(reihey[i])) {
                        int g = i + 1;
                        koordinaten = "" + g;
                    }

                }
                koordinaten = koordinaten + " ";

                for (int i = 0; i < reihex.length; i++) {
                    if (b.equalsIgnoreCase(reihex[i])) {
                        int g = i + 1;
                        koordinaten = koordinaten + "" + g;

                    }
                }
                for (int i = 0; i < sbox.length; ++i) {
                    if (sbox[i][1].equalsIgnoreCase(koordinaten)) {
                        resultset[k][z] = sbox[i][0];
                    }
                }
            }
        }

        return resultset;
    }

    public static String[][] shiftrows(String[][] eingabe) {
        String[][] array = eingabe;
        String[][] neuesarray = new String[4][4];

        for (int i = 0; i < 4; i++) {

            for (int j = 0; j < 4; j++) {
                int zählervar = 0;

                zählervar = j + 1;

                if (zählervar % 4 == 0) {
                    zählervar = zählervar - 4;
                    neuesarray[i][j] = array[i][zählervar];

                } else {
                    neuesarray[i][j] = array[i][zählervar];

                }

            }

        }
        return neuesarray;
    }

    public static String[] generateroundkey(String schlüssel, String[][] b) {
        String[] c = null;
        return c;

    }

    public static String[][] mixColumns(String[][] b) {
        String[][] c = {{"2", "3", " 1", " 1"},
        {"1", " 2", " 3", " 1"},
        {"1", "1", "2", "3"},
        {"3", " 1", "1", "2"}};
        String[][] zielarray = new String[4][4];

        for (int i = 0; i < 4; i++) {
            int finzahl = 0;

            int[] array4 = new int[4];
            for (int j = 0; j < 4; j++) {
                int[] binärzahlenergebnis = null;
                int[] binärzahlenrechenarray = null;

                String tabelle = c[i][j];
                String geheimString = b[j][i];
                binärzahlenergebnis = Encry.Stringzuintarray(geheimString);
                int Stringalsint = Encry.Stringzuint(geheimString);

                if (c[i][j].equalsIgnoreCase("1")) {
                    array4[j] = Stringalsint;

                }
                if (c[i][j].equalsIgnoreCase("2")) {

                    binärzahlenrechenarray[0] = 0;
                    for (int f = 0; f < 7; f++) {
                        binärzahlenrechenarray[f] = binärzahlenergebnis[f + 1];

                    }
                    // bei x8 werden die unterschiedlichen potenzen ersetzt    

                    // x4, x3, x, +1
                    if (binärzahlenrechenarray[binärzahlenrechenarray.length - 1] == 1) {
                        //x4
                        if (binärzahlenrechenarray[5] == 0) {
                            binärzahlenrechenarray[5] = 1;
                        }
                        if (binärzahlenrechenarray[5] == 1) {
                            binärzahlenrechenarray[5] = 0;
                        }
                        //x3
                        if (binärzahlenrechenarray[4] == 0) {
                            binärzahlenrechenarray[4] = 1;
                        }
                        if (binärzahlenrechenarray[4] == 1) {
                            binärzahlenrechenarray[4] = 0;
                        }
                        //x
                        if (binärzahlenrechenarray[2] == 0) {
                            binärzahlenrechenarray[2] = 1;
                        }
                        if (binärzahlenrechenarray[1] == 1) {
                            binärzahlenrechenarray[1] = 0;
                        }
                        // 1
                        if (binärzahlenrechenarray[0] == 0) {
                            binärzahlenrechenarray[0] = 1;
                        }
                        if (binärzahlenrechenarray[0] == 1) {
                            binärzahlenrechenarray[0] = 0;
                        }

                        array4[j] = Encry.intarrayzuint(binärzahlenrechenarray);
                    }

                }
                if (c[i][j].equalsIgnoreCase("3")) {
                    binärzahlenrechenarray[0] = 0;
                    for (int f = 0; f < 7; f++) {
                        binärzahlenrechenarray[f] = binärzahlenergebnis[f + 1];

                    }
                    // bei x8 werden die unterschiedlichen potenzen ersetzt    

                    // x4, x3, x, +1
                    if (binärzahlenrechenarray[binärzahlenrechenarray.length - 1] == 1) {
                        //x4
                        if (binärzahlenrechenarray[5] == 0) {
                            binärzahlenrechenarray[5] = 1;
                        }
                        if (binärzahlenrechenarray[5] == 1) {
                            binärzahlenrechenarray[5] = 0;
                        }
                        //x3
                        if (binärzahlenrechenarray[4] == 0) {
                            binärzahlenrechenarray[4] = 1;
                        }
                        if (binärzahlenrechenarray[4] == 1) {
                            binärzahlenrechenarray[4] = 0;
                        }
                        //x
                        if (binärzahlenrechenarray[2] == 0) {
                            binärzahlenrechenarray[2] = 1;
                        }
                        if (binärzahlenrechenarray[1] == 1) {
                            binärzahlenrechenarray[1] = 0;
                        }
                        // 1
                        if (binärzahlenrechenarray[0] == 0) {
                            binärzahlenrechenarray[0] = 1;
                        }
                        if (binärzahlenrechenarray[0] == 1) {
                            binärzahlenrechenarray[0] = 0;
                        }

                    }
                    // binärzahlenergebnis array und binärzahlenrechenarray
                    // binärzahlenrechenarray V0rrang, also zuerst ersetzen, wenn x7
                    // dann die Produkte aus +1 hinzurechnen
                    for (int k = 0; i < 7; i++) {

                        if (binärzahlenrechenarray[i] == 1 && binärzahlenergebnis[i] == 1) {
                            binärzahlenrechenarray[i] = 0;

                        }
                        if (binärzahlenrechenarray[i] == 1 && binärzahlenergebnis[i] == 0) {
                            binärzahlenrechenarray[i] = 1;

                        }
                        if (binärzahlenrechenarray[i] == 0 && binärzahlenergebnis[i] == 1) {
                            binärzahlenrechenarray[i] = 1;

                        }
                        if (binärzahlenrechenarray[i] == 0 && binärzahlenergebnis[i] == 0) {
                            binärzahlenrechenarray[i] = 0;

                        }

                    }
                    array4[j] = Encry.intarrayzuint(binärzahlenrechenarray);

                }

            }

            finzahl = Encry.neueZahl(array4);

        }
        return zielarray;

    }

    public static int intarrayzuint(int[] b) {
        int n = 0;
        int zähler = 1;
        for (int l = 0; l < b.length; l++) {
            n = n + b[l] * zähler;
            zähler = zähler * 10;

        }
        return n;

    }

    public static int[] Stringzuintarray(String b) {
        // Verwandlung von hex zu dezimal 
        int dezINT = Integer.parseInt(b, 16);
        // von dez zu binär
        String bin = Integer.toBinaryString(dezINT);
        int aktuellebin = Integer.parseInt(bin);
        int[] zahlinbinarray = new int[8];

        //zu int array
        for (int k = 0; k < bin.length(); k++) {
            int zähler = 10;
            int zahlindex;
            zahlindex = aktuellebin % zähler;
            zahlinbinarray[k] = zahlindex;
            zähler = zähler * 10;

        }
        return zahlinbinarray;

    }

    public static int Stringzuint(String n) {
        int dezINT = Integer.parseInt(n, 16);
        // von dez zu binär
        String bin = Integer.toBinaryString(dezINT);
        int aktuellebin = Integer.parseInt(bin);

        return aktuellebin;

    }

    public static int[][] arraytransform(String[]a) {
        int[][] darray = new int[a.length][8];
        for (int l = 0; l < a.length; l++) {

            String element;
            element = a[l] + "";

            for (int j = 0; j < 8; j++) {
                //darray[l][j] = Integer.parseInt(element.charAt(j) +"");
                int ff = element.charAt(j);
                System.out.println(ff);

            }
            System.out.println(" ");

        }
        return darray;

    }

    public static int[][] matmatmult(int[][] a, int[][] b) {
        int[][] neuesprodukt = new int[a.length][a[0].length];

        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < a[i].length; j++) {
                neuesprodukt[i][j] = a[i][j] * b[j][i];

            }
        }

        return neuesprodukt;
    }
    
    public static String[][] addroundkey(String[][] b, String[][] schlüssel ){
        
        String[][] ergebnis = new String[4][4];
        
        for(int i=0;i<4;i++){
            
            for(int j=0;j<4;j++){
                String vergleich1 = b[i][j];
                String vergleich2 = schlüssel[i][j];
                String rückgabe="";
                for(int k=0;k<8;i++){
                      char h = vergleich1.charAt(k);
                      String l1 = h +"";
                      
                      char h2 = vergleich2.charAt(k);
                      String l2 = h2 +"";
                    
                    
                    if(l1.equalsIgnoreCase("1") && l2.equalsIgnoreCase("1")){
                        rückgabe = rückgabe +"0";
                    }
                    if(l1.equalsIgnoreCase("0") && l2.equalsIgnoreCase("1")){
                        rückgabe = rückgabe +"1";
                    }
                    if(l1.equalsIgnoreCase("1") && l2.equalsIgnoreCase("0")){
                        rückgabe = rückgabe +"1";
                    }
                    if(l1.equalsIgnoreCase("0") && l2.equalsIgnoreCase("0")){
                        rückgabe = rückgabe +"0";
                    }
                }
                ergebnis[i][j] = rückgabe;
                
            }
            
        }
        return ergebnis;
    }
    
    public static String[][] Stringhex2StringDez(String[][]b){
        String[][] result = new String[4][4];
        
        for(int i=0;i<4;i++){
            
            for(int j=0;j<4;j++){
                
            }
        }
        return result;
        
    }

}
