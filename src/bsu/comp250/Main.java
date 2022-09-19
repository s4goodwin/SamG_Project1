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


        ArrayList<String> patients =new ArrayList<String>();
        String txtFile;
        Scanner keyboard;

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
            System.out.println(splitValues[0]);
            System.out.println(splitValues[2]);
            //System.out.println(splitValues[3]);
            System.out.println();



            //fileContent=fileContent.concat(txtFileScan.nextLine()+"\n");
        }

        //String[] noComma=txtFileScan.split(",");//does not work

        //System.out.println(Arrays.toString(noComma));



    }
}
