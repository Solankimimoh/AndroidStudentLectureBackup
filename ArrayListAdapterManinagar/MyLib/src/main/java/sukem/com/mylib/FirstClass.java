package sukem.com.mylib;

public class FirstClass {

    public static void main(String[] args) {

        int num[] = new int[5];

        num[0] = 1;
        num[1] = 20;
        num[2] = 40;
        num[3] = 200;

        for (int i = 0; i < num.length; i++) {
            System.out.println("num[" + i + "]" + num[i]);
        }

//        search,insert at any index,remove from any index, sort

//        ArrayList   - operation ( Array )

        System.out.println(num[2]);

    }
}
