import Model.Children;
import Model.Hobby;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Hobby hobby1 = new Hobby("Football","Outdoor");
        Hobby hobby2 = new Hobby("tt","Indoor");
        Hobby hobby3 = new Hobby("Swimming","Outdoor");

        ArrayList<Hobby> A = new ArrayList<>();
        A.add(hobby1);
        ArrayList<Hobby> B = new ArrayList<>();
        B.add(hobby2);
        ArrayList<Hobby> C = new ArrayList<>();
        C.add(hobby3);


        Children child1 = new Children("Tatsam",18,11,A);
        Children child2 = new Children("Abhiskar",7,12,B);

        System.out.println(child1.getFullName());

        child2.getHobbyArraylist();


    }
}