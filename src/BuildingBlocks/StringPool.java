package BuildingBlocks;

class StringPool {
    public static void main(String[] args) {
    /*In java strings are pooled on the heap which
    * essentially means there is a heap of unique strings
    * with variables pointing to each entry
    *
    * In our case there is a pointer from s1 and s2 to the word "Java"
    * in our heap. And since '==' comparator compares whether s1 and s2 point
    * to the same location s1 == s2 ? true.
    *
    * When we create a new word with the StringBuilder method it is in a different location
    * therefore sb1.toString() == s1 ? false.
    *
    * However the individual letters are the same that's why the .equal methods which
    * compares the individual values comes out to true.
    *
    * */

        String s1 = "Java";
        String s2 = "Java";
        StringBuilder sb1 = new StringBuilder();
        sb1.append("Ja").append("va");
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        System.out.println(sb1.toString()==s1);
        System.out.println(s1.toString().equals(s1));
    }
}

