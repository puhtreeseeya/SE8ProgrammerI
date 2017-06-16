package BuildingBlocks;

public class Garbage {
    protected void finalize() {
        System.out.println("GROSS!!!");
    }

    public static void main(String[] args) {
        Garbage garb = new Garbage();
        garb = null;
        System.gc();
    }
}
