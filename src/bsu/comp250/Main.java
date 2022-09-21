package bsu.comp250;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        /*Person person1=new Person("Sam", 69);
        System.out.println(person1.name);
        System.out.println(person1.age);
        System.out.println();

        Patient patient1=new Patient("Leroy", 35, "Dr.Smith");
        System.out.println(patient1.name);
        System.out.println(patient1.age);
        System.out.println(patient1.doctor);*/


        ArrayList<String> patients =null;    //new ArrayList<String>();
        String txtFile;
        Scanner keyboard;
        Patient values = null;


        txtFile=new String();
        Scanner txtFileScan;



        try{
            txtFileScan=new Scanner(new File("C:\\Users\\samgo\\Documents\\Java Projects\\Comp 250\\SamG_Project1\\src\\bsu\\comp250\\patients.txt"));

        }catch (FileNotFoundException e){
            System.out.println("patients.txt not found");
            return;
        }


        while (txtFileScan.hasNextLine()){
            String fileContent=txtFileScan.nextLine();
            String[] splitValues=fileContent.split(",");


            try{
                int patientAge=Integer.parseInt(splitValues[1]);
                Patient current=new Patient(splitValues[0], patientAge,splitValues[2]);

            } catch (Exception e){
                System.out.println("Invalid age");
                break;
            }





            /*String splitValuesName=splitValues[0];
            String splitValuesAgeSt=splitValues[1];
            String splitValuesDoctor=splitValues[2];*/







            /*System.out.println(splitValues[0]);
            System.out.println(splitValues[2]);

            System.out.println();*/


            //Patient ex =new Patient(splitValues[])

            //patients=new ArrayList<String>(Arrays.asList(splitValues[0],splitValues[2]));
            //System.out.println(patients);

            //int splitValuesInt=Integer.parseInt(fileContent);

            //fileContent=fileContent.concat(txtFileScan.nextLine()+"\n");
        }



        while (true){
            keyboard=new Scanner(System.in);
            System.out.println("Please enter: ");
            System.out.println("A-to list all patients");
            System.out.println("B-to list all patients younger than 40");
            System.out.println("C-to list all patients older than 40");
            System.out.println("D-to exit");

            String input=keyboard.nextLine();
            switch (input){
                case "A":
                    //call method that loops through list of patients and prints their information using tostring

                case "B":
                    //calls method only print out information if age is <40

                case "C":
                    //calls method only print out information if age>40

                case "D":
                    System.exit(0);
            }

        }












        //String[] noComma=txtFileScan.split(",");//does not work

        //System.out.println(Arrays.toString(noComma));



    }
}
