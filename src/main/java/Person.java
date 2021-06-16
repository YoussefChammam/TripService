//Author : Youssef Chammam

import org.w3c.dom.ls.LSOutput;
import java.util.Scanner;

public class Person {
    String name;
    int age;
    String job;
    //getters and setters
    public void setName(){
        System.out.println("please enter your name");
        Scanner scan1 = new Scanner(System.in);
        name = scan1.next();
    }
    public String getName(){
        return name;
    }

    public void setAge(){
        System.out.println("please enter your name");
        Scanner scan2 = new Scanner(System.in);
        age = scan2.nextInt();
    }
    public int getAge(){
        return age;
    }

    public void setJob(){
        System.out.println("please enter your name");
        Scanner scan3 = new Scanner(System.in);
        job = scan3.next();
    }
    public String getJob(){
        return job;
    }

}