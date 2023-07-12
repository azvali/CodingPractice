/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package smallPrograms;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author azval
 */
public class fileRead {
    fileRead(){
        try{    
            File file = new File("/Users/admin/Desktop/csi3210/data.txt");
            Scanner scan = new Scanner(file);
            try{
                int i = 0;
                int sum = 0;
                double average;
                while(scan.hasNextInt()){
                    sum += scan.nextInt();    //total of all integers in txt file
                    i++;     //number of integers added together
                }
                //find the average 
                average = (double)sum / (double)i;
                System.out.printf("The average is %.3f" , average);
            }
            finally{
                scan.close();
            }
            
        } 
        catch(Exception FileNotFound){
                
        }
    }
}
