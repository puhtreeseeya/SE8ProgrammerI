package OperatorStatements;

public class TernaryTester {
    public static void main (String[] args) {
        int x = 5;
        System.out.println((x > 2) ? (x < 4 ? 10 : 8) :  7);
        /*use of parenthesis increases readability. look how ugly this looks*/
        System.out.println(x > 2 ? x < 4 ? 10 : 8 : 7);
    }
}
