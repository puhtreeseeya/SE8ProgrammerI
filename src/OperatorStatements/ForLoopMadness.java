package OperatorStatements;

public class ForLoopMadness {
    public static void main (String[] args) {
        for(int i=0; i<10; ) {
            i=++i;
            //i = i++;
            System.out.println(i + " " +"Hello World");
        }

        //another example of increments
        int a=1;
        System.out.println(a++); //you will see 1
        //a has now been incremented to 2
        System.out.println(a);
        System.out.println(++a); //now a is 3
    }
}

/*The reason i = i++ does not work while i = i++ does is becaus
*       ++i: increments and THEN uses the variable
*       i++: uses the variable and THEN increments
*
*       essentially it's pointless to increment i after already setting it to itself
*       it basically stays at 0.
**/