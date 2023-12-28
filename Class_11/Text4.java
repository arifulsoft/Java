package inheritance;

import java.util.ArrayList;

public class Text4 {

    public static void main(String[] args) {
        Book b1 = new Book("Physics", "Jafor iqbal", 2013, 500);
        Book b2 = new Book("bangla", "Sumon", 2014, 400);
        Book b3 = new Book("English", "Rahim uddin", 2015, 600);
        Book b4 = new Book("Math", "Johir", 2016, 300);
        Book b5 = new Book("Zoology", "Ariful islam", 2017, 800);
        Book b6 = new Book("Botany", "Ajizur", 2018, 500);
        Book b7 = new Book("History", "Shamim", 2019, 700);
        Book b8 = new Book("Social", "Rahat", 2020, 500);
        Book b9 = new Book("Science", "Abu", 2021, 400);
        Book b10 = new Book("Acouting", "Foysal Hosain", 2022, 400);

        ArrayList<Book> list1 = new ArrayList<>();
        list1.add(b1);
        list1.add(b2);
        list1.add(b3);
        list1.add(b4);
        list1.add(b5);
        list1.add(b6);
        list1.add(b7);
        list1.add(b8);
        list1.add(b9);
        list1.add(b10);
//        System.out.println(list1.get(0).WriterNAme);
//        System.out.println(list1.get(1).WriterNAme);
//        System.out.println(list1.get(2).WriterNAme);
//        System.out.println(list1.get(3).WriterNAme);
//        System.out.println(list1.get(4).WriterNAme);
//        System.out.println(list1.get(5).Wri+terNAme);
//        System.out.println(list1.get(6).WriterNAme);
//        System.out.println(list1.get(7).WriterNAme);
//        System.out.println(list1.get(8).WriterNAme);
//        System.out.println(list1.get(9).WriterNAme);

for(int i=0;i<list1.size(); i++){
System.out.println(list1.get(i).WriterNAme);
}
System.out.println(list1.size());

       
        

    }
}
