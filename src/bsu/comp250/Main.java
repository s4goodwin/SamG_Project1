package bsu.comp250;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Person person1=new Person("Sam", 69);
        System.out.println(person1.name);
        System.out.println(person1.age);
        System.out.println();

        Patient patient1=new Patient("Leroy", 35, "Dr.Smith");
        System.out.println(patient1.name);
        System.out.println(patient1.age);
        System.out.println(patient1.doctor);


        ArrayList<String> patients =new ArrayList<String>();


        Scanner patient=new Scanner(System.in);
        Scanner keyboard;

        try{
            patient=new Scanner(new File("C:\\Users\\samgo\\Documents\\Java Projects\\Comp 250\\SamG_Project1\\src\\bsu\\comp250\\patients.txt"));

        }catch (FileNotFoundException e){
            System.out.println("patients.txt not found");
        }

        while (patient.hasNextLine()){
            System.out.println(patient.nextLine());
        }



    }
}
