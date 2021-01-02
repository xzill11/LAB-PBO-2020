//fazil basri

public class ArrayMultiDimensi {

    public static void main(String[] args) {

        String[][] provinsi = new String[3][2];
        provinsi[0][0] = "Aceh";
        provinsi[0][1] = "Banda Aceh";
        provinsi[1][0] = "Maluku Utara";
        provinsi[1][1] = "iyain";
        provinsi[2][0] = "Papua";
        provinsi[2][1] = "Manokwari";

        for (int i = 0; i < provinsi.length; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append("Ibukota ")
                    .append(provinsi[i][0])
                    .append(" adalah ")
                    .append(provinsi[i][1])
                    .append(".");
            System.out.println(sb);
        }
    }
} 

/**
    Outputnya :
    Ibukota Aceh adalah Banda Aceh.
    Ibukota Maluku Utara adalah iyain.
    Ibukota Papua adalah Manokwari.
    
    ouputnya = add string use mathod.append dari stringbuilder
*/