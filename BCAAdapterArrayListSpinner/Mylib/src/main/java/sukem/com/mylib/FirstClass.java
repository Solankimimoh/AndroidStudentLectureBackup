package sukem.com.mylib;

public class FirstClass {

    public static void main(String[] args) {

        int num[] = new int[10];

        num[0] = 15;
        num[1] = 25;
        num[2] = 55;
        num[5] = 225;
        num[6] = 925;


        System.out.println("ARRAY SIZE " + num.length);

        for (int i = 0; i < num.length; i++) {
            System.out.println("num[" + i + "] = " + num[i]);
        }


    }

}
