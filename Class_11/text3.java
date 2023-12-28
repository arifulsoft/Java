package inheritance;

import java.awt.BorderLayout;

public class text3 {

    public static void main(String[] args) {
        Student s1 = new Student(101, "Ariful", 57, "Male", "Mymebsingh", 90000, "Mymebsingh", 5.00);
        Student s2 = new Student(102, "Raj", 51, "Male", "Dhaka", 90000, "Munsiganj", 4.00);
        Student s3 = new Student(103, "Shamim", 52, "Male", "Khulna", 90000, "Kustia", 4.50);
        Student s4 = new Student(104, "Sumon", 53, "Male", "Dhaka", 90000, "Cumilla", 5.00);
        Student s5 = new Student(105, "Tamim", 54, "Male", "Dhaka", 90000, "Gazipur", 3.00);

        System.out.println("id" + "\t" + "name" + "\t" + "Round" + "\t" + "gender" + "\t" + "Division" + "\t" + "Expansive" + "\t" + "district" + "\t" + "GPA" + "\t");
        System.out.println("...." + "\t" + "....." + "\t" + "....." + "\t" + "....." + "\t" + "........" + "\t" + "......." + "\t" + "\t" + "....." + "\t" + "\t" + "....." + "...");
        System.out.println(s1.id + "\t" + s1.name + "\t" + s1.round + "\t" + s1.gender + "\t" + s1.divison + "\t" + s1.expancive + "\t" + "\t" + s1.district + "\t" + s1.gpa + "\t");
        System.out.println(s2.id + "\t" + s2.name + "\t" + s2.round + "\t" + s2.gender + "\t" + s2.divison + "\t" + "\t" + s2.expancive + "\t" + "\t" + s2.district + "\t" + s2.gpa + "\t");
        System.out.println(s3.id + "\t" + s3.name + "\t" + s3.round + "\t" + s3.gender + "\t" + s3.divison + "\t" + "\t" + s3.expancive + "\t" + "\t" + s3.district + "\t" + "\t" + s3.gpa + "\t");
        System.out.println(s4.id + "\t" + s4.name + "\t" + s4.round + "\t" + s4.gender + "\t" + s4.divison + "\t" + "\t" + s4.expancive + "\t" + "\t" + s4.district + "\t" + "\t" + s4.gpa + "\t");
        System.out.println(s5.id + "\t" + s5.name + "\t" + s5.round + "\t" + s5.gender + "\t" + s5.divison + "\t" + "\t" + s5.expancive + "\t" + "\t" + s5.district + "\t" + "\t" + s5.gpa + "\t");

    }
}
