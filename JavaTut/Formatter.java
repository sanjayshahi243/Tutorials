// Foramatter

import java.text.DecimalFormat;

class Formatter {
    public static void main (String[] args) {
        DecimalFormat formatter = new DecimalFormat("0.0%");
        double myNum = .314159;
        System.out.println(formatter.format(myNum));
    }
}