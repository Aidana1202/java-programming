package day30_arrays;

public class StudentClass {
    public static void main(String[] args) {
        String[] student1 = {"id1234", "aidana", "Baimukhambet", "B-22", "508_241_0031"};
        // this way useful when you don't know the value yet!!!!!
        String[] student2 = new String[5];
        student2[0] = "id23456";
        student2[1] = "Alex";
        student2[2] = "Yaskovets";
        student2[3] = "B-23";
        //student2[4] = "508_280_4515";
        //
        System.out.println("student1 id = " + student1[0]);
        System.out.println("student1 firstName = " + student1[1]);
        System.out.println("student1 lastName = " + student1[2]);
        System.out.println("student1 batchNum = " + student1[3]);
        System.out.println("student1 phoneNum = " + student1[4]);
        // length
        System.out.println("student1 length: " + student1.length);
        //
        if(student1.length == 5) {
            System.out.println("True. Student length is 5!");
        } else{
            System.out.println("Fail");
        }
        //
        if(student1.length == student2.length) {
            System.out.println("True. Student1 length is equal to Student2!");
        }else {
            System.out.println("Fail. Student1 length is not equal to Student2!");
        }
        //
        System.out.println(student1[1].toUpperCase()+ " " + student1[2].toUpperCase());
        //
        String mobileNum = student1[4];
        System.out.println("mobileNum = " + mobileNum);

    }
}
