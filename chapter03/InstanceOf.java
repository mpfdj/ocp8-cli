// blz 97

public class InstanceOf {

    public static void main(String[] args) {

        Kim kim = new Kim();

        System.out.println(kim instanceof DeJaeger);  // true



        // blz 98
        Integer zooTime = Integer.valueOf(9);
        Number num = zooTime;
        Object obj = zooTime;

        System.out.println(zooTime instanceof Number);  //true


    }

}
