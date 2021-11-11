package aquarium;

// No need to import class Water since the classes are in the same package!!! (blz 30)


public class Tank {
    public static void main(String[] args) {
        Water water = new Water();
        System.out.println(water.getClass());
    }
}