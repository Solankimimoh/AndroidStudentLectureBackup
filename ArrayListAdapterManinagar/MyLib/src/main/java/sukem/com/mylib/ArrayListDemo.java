package sukem.com.mylib;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {

//        int num[] = new  int[10];
        ArrayList<Integer> integerArrayList = new ArrayList<>();


//        num[0]=10 , num[1]=20
        integerArrayList.add(50);
        integerArrayList.add(40);
        integerArrayList.add(80);

        System.out.println(integerArrayList);

        integerArrayList.remove(1);
        System.out.println(integerArrayList);
        integerArrayList.add(1, 450);
        System.out.println(integerArrayList);
//num.length
//        for (int i = 0; i < integerArrayList.size(); i++) {
////            num[i]
//            System.out.println(integerArrayList.get(i));
//        }

        for (int i = 0; i < integerArrayList.size(); i++) {
            System.out.println("integerArrayList[" + i + "] = " + integerArrayList.get(i));
        }



    }
}
