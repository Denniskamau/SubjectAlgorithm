/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marksalgorithm;
import java.util.*;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author dennis
 */
public class MarksAlgorithm {

    /**
     * @param args the command line arguments
     */
    
    public static List<Integer> finalMarksArray = new ArrayList<Integer>();
    public static List<String> subjects = new ArrayList<String>();
    public static List<Integer> numberOfStudents = new ArrayList<Integer>();
    public static int separator =101;
    
    public static void main(String[] args) {
        // TODO code application logic here
        enterSubject();
        

    }
    
    public static void enterSubject(){
        Scanner input = new Scanner(System.in);
        String subjectMessage = "Enter Subject:";
        System.out.println(subjectMessage);
        
        
        String subject = input.next();
        subjects.add(subject);
       // System.out.println(subjects);
        marks();
      
    }
    
    public static void displayMarks(){
        System.out.println("Subjects enterd are:"+""+subjects);
        System.out.println("Number of students are :"+""+numberOfStudents);
        
        /*int index = subjects.indexOf(separator);
        System.out.println("index is "+index);
        System.out.println("Marks entered are: "+ ""+finalMarksArray);
        while (finalMarksArray.contains(separator)){
            System.out.println("Marks entered are: "+ ""+finalMarksArray.subList(0, finalMarksArray.size()-index));
       }*/
        for (int j=0; j<numberOfStudents.size();j++){
            int arrayNo=0;
            int no=numberOfStudents.get(j);
            

            System.out.println("Marks entered for "+ subjects.get(j) + ""+finalMarksArray.subList(arrayNo, no));
            arrayNo+=no;
            
            
        }
        
            
        
    }
    
    public static void marks(){
        Scanner input = new Scanner(System.in);
        String studentNumberMessage = "Enter the number of student:";
        System.out.println(studentNumberMessage);
        int studentNumber = input.nextInt();
        numberOfStudents.add(studentNumber);
        //System.out.println("Student number is :"+studentNumber);

        
        //List<Integer> marksArray = new ArrayList<Integer>();
        
       
        
        int i = 1;
        while (i<=studentNumber){
         String marksMessage = "Enter the marks of the Students:";
         System.out.println(marksMessage);
         int marks = input.nextInt();
         
         //marksArray.add(marks);
         finalMarksArray.add(marks);
         
         i++;
        }
        
        //finalMarksArray.add(separator);
        //System.out.println("Marks are:"+marksArray);
        Scanner params = new Scanner(System.in);
        String proceedMessage = "Do you want to proceed to another subject?";
        System.out.println(proceedMessage);
        String optionMessage = "Select Y for Yes and N for No";
        System.out.println(optionMessage);
        String choise = params.next();
        
       // Boolean next = true;
        if(choise.contains("Y")){
            enterSubject();
        }
        else{
            displayMarks();
        }
 
    }

    
}
