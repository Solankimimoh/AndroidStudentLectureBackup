package sukem.com.mylib;

import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {


//        int num[] = new int[10];
        ArrayList<Integer> numIntegerArrayList = new ArrayList<>();

        //        num[0]=10;
//        numIntegerArrayList.add(20);
//        numIntegerArrayList.add(10);
//        numIntegerArrayList.add(40);
//        numIntegerArrayList.add(50);
//        numIntegerArrayList.add(90);
//
//        System.out.println(numIntegerArrayList);
//
//        numIntegerArrayList.remove(2);
//        numIntegerArrayList.add(0, 78);
//
//        System.out.println(numIntegerArrayList);


        //
//        for (int i = 0; i < numIntegerArrayList.size(); i++) {
////            num[i]
//            System.out.println("VALUE "+numIntegerArrayList.get(i));
//        }


//        String Array List

        ArrayList<String> stringArrayList = new ArrayList<>();

        stringArrayList.add("HELLO");
        stringArrayList.add("ANU");
        stringArrayList.add("DISHA");
        stringArrayList.add("MANSI");
        stringArrayList.add("RAHUL");
        stringArrayList.add("YASH");
        stringArrayList.add("ABC");

        System.out.println(stringArrayList);

        stringArrayList.add(1, "ANDROID");
        System.out.println(stringArrayList.indexOf("ANU"));



    }

}
