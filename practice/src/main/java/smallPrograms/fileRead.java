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
            File file = new File("C:\\Users\\azval\\OneDrive\\Desktop\\data.txt");
            Scanner scan = new Scanner(file);
            try{
                while(scan.hasNextLine()){
                    System.out.println(scan.nextLine());
                }
            }
            finally{
                scan.close();
            }
            
        } 
        catch(Exception FileNotFound){
                
        }
    }
}
