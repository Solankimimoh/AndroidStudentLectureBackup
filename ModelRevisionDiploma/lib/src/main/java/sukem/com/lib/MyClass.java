package sukem.com.lib;

import java.util.ArrayList;

public class MyClass {

    public static void main(String[] args) {

        ArrayList<StudentModel> studentModelArrayList = new ArrayList<>();


        StudentModel dhruvil = new StudentModel();
        dhruvil.setName("Dhruvil");
        dhruvil.setEmail("dhruvil@gmail.com");
        dhruvil.setMobile("840146523");


        StudentModel darshak = new StudentModel();
        darshak.setName("Darshak");
        darshak.setEmail("darshak@gmail.com");
        darshak.setMobile("654561656");

        StudentModel swati = new StudentModel("swati",
                "swati@10spi.com",
                "100%");


        studentModelArrayList.add(dhruvil);
        studentModelArrayList.add(darshak);
        studentModelArrayList.add(swati);
        studentModelArrayList.add(new StudentModel("prembhai", "premchopra@gmail.com", "654546541"));

//        System.out.println(studentModelArrayList);


        for (int i = 0; i < studentModelArrayList.size(); i++) {
            System.out.println(studentModelArrayList.get(i).getName());
            System.out.println(studentModelArrayList.get(i).getEmail());
        }


    }
}
