public class Casting {


    public static void main(String[] args) {
        byte b = (byte) (Byte.MAX_VALUE + 1);
        System.out.println(b);  // Overflow
    }

}
