// blz 94

public class CompoundOperator {


    public static void main(String[] args) {

        long goat = 10;
        int sheep = 5;
        sheep = sheep * goat;  // doesn't compile

        sheep *= goat;  // the compound operator first casts sheep to long, apply the multiplication of the 2 long values, and then cast the result to an int

    }

}
