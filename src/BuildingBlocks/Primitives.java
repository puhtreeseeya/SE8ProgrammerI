package BuildingBlocks;

public class Primitives {

    public static void main(String[] args) {
        short numPets = 5;
        //int numGrains = 5.6;
        String name = "Scruffy";
        //numPets.length();
        //numGrains.length();


    }
}

 /*
        * Take Aways:
        *  - numGrains is invalid because numGrains is an int and 5.6 is a floating point number
        *  - .length will not work on numPets and numGrains because they are primitive types and
        *  primitives do NOT allow methods to be called on them.
        *
        *  so... int.toString() == wrong! Integer.toString() == valid!
        *
        * What are primitive types?
        * - byte, short, int, long, float, double
        * - boolean
        * - char
        *
        * What are primitive default values?
        *   float and double = 0.0;
        *   byte, short, int, long = 0;
        *   char = u0000
        * */