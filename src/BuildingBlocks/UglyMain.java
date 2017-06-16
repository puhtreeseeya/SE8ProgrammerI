package BuildingBlocks;

public class UglyMain {
    //String[] _names
    //String[] 123
    //String abc[]
    //String _Names[]
    //String names
    public static void main(String... $n) {
        System.out.println("hello world");
    }
}

/* This question was really annoying because there were a lot of
 * moving parts to it. Mostly it wanted to check your understanding of
  * the main function and varargs
  *
  * Note:
  *     variables _abc : Valid
  *     variable 123abc: NOT valid, cannot start with digits
  *     Class _abc: NOT valid
  *
  *     Main method must be...
  *         - public
  *         - return type void
  *         - static
  *         - public static == static public
  *
  * Takeaways:
  *     - main takes in an array of strings
  *         - String[] _names: valid
  *         - String[] 123: NOT valid
  *         - String _Names[] == String[] _Names: valid
  *         - String names: NOT valid -- type mismatch
  *         - String... $n -- variable length argument of strings [0...n] == array of strings?
   *      */