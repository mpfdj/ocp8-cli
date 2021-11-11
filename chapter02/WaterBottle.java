public class WaterBottle {

    static float code;
    static long l;

    public static void main(String[] args) {
        System.out.println(code);
        System.out.println(l);
        var number = 1/0;  // compiles fine but throws a runtime Exception
        number = "hello";  // can't re-assign type
//        float f = 50.0;
        float f2 = 6_000f;



    }


}
