public class CastingPrimitives {

    public static void main(String[] args) {
        float f = 1.9f;
        int i = (int) f;

        System.out.println(i);  // floor  1

        long l = (int) 2;
        l -= 1.1;
        System.out.println(l); // ceiling  0

        short h = 1, w = 3;
//        short z = (byte) h * (byte) w;
//        short z = (byte) h + (byte) w;

        int i2 = (int) (1.4 + 2.4f);
        System.out.println(i2);  // 3

    }


}
