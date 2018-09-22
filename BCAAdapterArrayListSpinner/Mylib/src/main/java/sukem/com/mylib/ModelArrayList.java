package sukem.com.mylib;

import java.util.ArrayList;

public class ModelArrayList {
    public static void main(String[] args) {

        ArrayList<StudentModel> studentModelArrayList = new ArrayList<>();

        StudentModel mimoh = new StudentModel();
        mimoh.name = "MIMOH SOLANKI";
        mimoh.mobile = 123;

        StudentModel rahul = new StudentModel();
        rahul.name = "RAHUL";
        rahul.mobile = 456;

        studentModelArrayList.add(mimoh); // ["MIMOHSOLANKI",123];
        studentModelArrayList.add(rahul); // ["RAHUl",456];

        System.out.println(studentModelArrayList);

//        for (int i = 0; i < studentModelArrayList.size(); i++) {
//            System.out.println(studentModelArrayList.get(i).name + " | " + studentModelArrayList.get(i).mobile);
//        }


        StudentModel disha = new StudentModel("DISHA", 486);
        StudentModel niyati = new StudentModel("NIYATI", 789);

        studentModelArrayList.add(disha);
        studentModelArrayList.add(niyati);

        studentModelArrayList.add(new StudentModel("ABC", 785));
        studentModelArrayList.add(new StudentModel("XYZ", 8526));


        for (int i = 0; i < studentModelArrayList.size(); i++) {
            System.out.println(studentModelArrayList.get(i).name + " | " + studentModelArrayList.get(i).mobile);
        }

    }
}
