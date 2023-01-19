package Model;

import java.util.ArrayList;

public class Children extends Parent {

    String name;
    int grade;
    int age;
    ArrayList<Hobby> HobbyArraylist;
    private ArrayList<Children> hobbyArraylist;

    public Children(String name, int grade, int age, ArrayList<Hobby> hobbyArraylist) {
        this.name = name;
        this.grade = grade;
        this.age = age;
        this.HobbyArraylist = hobbyArraylist;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public ArrayList<Children> getHobbyArraylist() {
        return hobbyArraylist;
    }

    public void setHobbyArraylist(ArrayList<Children> HobbyArraylist) {
        this.hobbyArraylist = hobbyArraylist;
    }

    public String getFullName() {
        String fullName = "My name is " + this.name + " " + this.family_name;
        return fullName;
    }

    public void gethobby() {
        ArrayList<Children> HobbyArraylist = this.hobbyArraylist;
        for (Children singleHobby : HobbyArraylist) {
            System.out.println("\tHobby is: " + singleHobby.getName());
        }


    }

}