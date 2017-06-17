package OperatorStatements;

public class MixedData {

    public static void main(String[] args) {

        byte x = 5;
        byte y = 10;
        int z1 = x+y;
        //NOTE: (byte)x + (byte)y will be promoted to an int so we can
        // store x+y in any variable with integral type larger than an int
        // this includes (longs, floats, and doubles)
        long z2 = x+y;
        float z3 = x+y;
        double z4 = x+y;

        long a = 10;
        short a1 = 10;
        //int b = 2 * a; ==>
        int b = 2 * (int) a;
        int c = (int) (2 * a);
        int d = 2 * a1;
        //B, C, D, F
    }
}
