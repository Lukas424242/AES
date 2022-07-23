public class Decry {
    public static String replaceHex(String n){
        String[][] sboxinv = {
{"52","1 1"},{"09","1 2"},{"6a","1 3"},{"d5","1 4"},{"30","1 5"},{"36","1 6"},
{"a5","1 7"},{"38","1 8"},{"bf","1 9"},{"40","1 10"},{"a3","1 11"},{"9e","1 12"},
{"81","1 13"},{"f3","1 14"},{"d7","1 15"},{"fb","1 16"},{"7c","2 1"},{"e3","2 2"},
{"39","2 3"},{"82","2 4"},{"9b","2 5"},{"2f","2 6"},{"ff","2 7"},{"87","2 8"},
{"34","2 9"},{"8e","2 10"},{"43","2 11"},{"44","2 12"},{"c4","2 13"},{"de","2 14"},
{"e9","2 15"},{"cb","2 16"},{"54","3 1"},{"7b","3 2"},{"94","3 3"},{"32","3 4"},
{"a6","3 5"},{"c2","3 6"},{"23","3 7"},{"3d","3 8"},{"ee","3 9"},{"4c","3 10"},
{"95","3 11"},{"0b","3 12"},{"42","3 13"},{"fa","3 14"},{"c3","3 15"},{"4e","3 16"},
{"08","4 1"},{"2e","4 2"},{"a1","4 3"},{"66","4 4"},{"28","4 5"},{"d9","4 6"},
{"24","4 7"},{"b2","4 8"},{"76","4 9"},{"5b","4 10"},{"a2","4 11"},{"49","4 12"},
{"6d","4 13"},{"8b","4 14"},{"d1","4 15"},{"25","4 16"},{"72","5 1"},{"f8","5 2"},
{"f6","5 3"},{"64","5 4"},{"86","5 5"},{"68","5 6"},{"98","5 7"},{"16","5 8"},
{"d4","5 9"},{"a4","5 10"},{"5c","5 11"},{"cc","5 12"},{"5d","5 13"},{"65","5 14"},
{"b6","5 15"},{"92","5 16"},{"6c","6 1"},{"70","6 2"},{"48","6 3"},{"50","6 4"},
{"fd","6 5"},{"ed","6 6"},{"b9","6 7"},{"da","6 8"},{"5e","6 9"},{"15","6 10"},
{"46","6 11"},{"57","6 12"},{"a7","6 13"},{"8d","6 14"},{"9d","6 15"},
{"84","6 16"},{"90","7 1"},{"d8","7 2"},{"ab","7 3"},{"00","7 4"},{"8c","7 5"},
{"bc","7 6"},{"d3","7 7"},{"0a","7 8"},{"f7","7 9"},{"e4","7 10"},{"58","7 11"},
{"05","7 12"},{"b8","7 13"},{"b3","7 14"},{"45","7 15"},{"06","7 16"},{"d0","8 1"},
{"2c","8 2"},{"1e","8 3"},{"8f","8 4"},{"ca","8 5"},{"3f","8 6"},{"0f","8 7"},
{"02","8 8"},{"c1","8 9"},{"af","8 10"},{"bd","8 11"},{"03","8 12"},{"01","8 13"},
{"13","8 14"},{"8a","8 15"},{"6b","8 16"},{"3a","9 1"},{"91","9 2"},{"11","9 3"},
{"41","9 4"},{"4f","9 5"},{"67","9 6"},{"dc","9 7"},{"ea","9 8"},{"97","9 9"},
{"f2","9 10"},{"cf","9 11"},{"ce","9 12"},{"f0","9 13"},{"b4","9 14"},{"e6","9 15"},
{"73","9 16"},{"96","10 1"},{"ac","10 2"},{"74","10 3"},{"22","10 4"},{"e7","10 5"},
{"ad","10 6"},{"35","10 7"},{"85","10 8"},{"e2","10 9"},{"f9","10 10"},{"37","10 11"},
{"e8","10 12"},{"1c","10 13"},{"75","10 14"},{"df","10 15"},{"6e","10 16"},{"47","11 1"},
{"f1","11 2"},{"1a","11 3"},{"71","11 4"},{"1d","11 5"},{"29","11 6"},{"c5","11 7"},
{"89","11 8"},{"6f","11 9"},{"b7","11 10"},{"62","11 11"},{"0e","11 12"},{"aa","11 13"},
{"18","11 14"},{"be","11 15"},{"1b","11 16"},{"fc","12 1"},{"56","12 2"},{"3e","12 3"},
{"4b","12 4"},{"c6","12 5"},{"d2","12 6"},{"79","12 7"},{"20","12 8"},{"9a","12 9"},
{"db","12 10"},{"c0","12 11"},{"fe","12 12"},{"78","12 13"},{"cd","12 14"},{"5a","12 15"},
{"f4","12 16"},{"1f","13 1"},{"dd","13 2"},{"a8","13 3"},{"33","13 4"},{"88","13 5"},
{"07","13 6"},{"c7","13 7"},{"31","13 8"},{"b1","13 9"},{"12","13 10"},{"10","13 11"},
{"59","13 12"},{"27","13 13"},{"80","13 14"},{"ec","13 15"},{"5f","13 16"},{"60","14 1"},
{"51","14 2"},{"7f","14 3"},{"a9","14 4"},{"19","14 5"},{"b5","14 6"},{"4a","14 7"},
{"0d","14 8"},{"2d","14 9"},{"e5","14 10"},{"7a","14 11"},{"9f","14 12"},{"93","14 13"},
{"c9","14 14"},{"9c","14 15"},{"ef","14 16"},{"a0","15 1"},{"e0","15 2"},{"3b","15 3"},
{"4d","15 4"},{"ae","15 5"},{"2a","15 6"},{"f5","15 7"},{"b0","15 8"},{"c8","15 9"},
{"eb","15 10"},{"bb","15 11"},{"3c","15 12"},{"83","15 13"},{"53","15 14"},{"99","15 15"},
{"61","15 16"},{"17","16 1"},{"2b","16 2"},{"04","16 3"},{"7e","16 4"},{"ba","16 5"},
{"77","16 6"},{"d6","16 7"},{"26","16 8"},{"e1","16 9"},{"69","16 10"},{"14","16 11"},
{"63","16 12"},{"55","16 13"},{"21","16 14"},{"0c","16 15"},{"7d","16 16"}};
    
    String[] reihey = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9",
             "A", "B", "C", "D", "E", "F"};

        String[] reihex = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9",
             "A", "B", "C", "D", "E", "F"};
        String resultset = "";

        String a = "" + n.charAt(0); // y buchstabe
        String b = "" + n.charAt(1); // x buchstabe
        String koordinaten = "";
        System.out.println(a+ " "+b);
        for (int i = 0; i < reihey.length; i++) {
            if (a.equalsIgnoreCase(reihey[i])) {
                int g=i+1;
                koordinaten = "" + g;
            }

        }
        koordinaten = koordinaten + " ";
        
        for (int i = 0; i < reihex.length; i++) {
            if (b.equalsIgnoreCase(reihex[i])) {
                int g=i+1;
                koordinaten = koordinaten +"" + g;

            }
        }
        for (int i = 0; i < sboxinv.length; ++i) {
            if (sboxinv[i][1].equalsIgnoreCase(koordinaten)) {
                resultset = sboxinv[i][0];
            }
        }
        System.out.println(koordinaten);

        return resultset;
    }
    
    public static String[][] shiftrowsinv(String[][] eingabe) {
        String[][] array = eingabe;
        String[][] neuesarray = new String[4][4];

        for (int i = 0; i < 4; i++) {

            for (int j = 0; j < 4; j++) {
                int zählervar = 0;

                zählervar =j-1 +4;

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
    
}
