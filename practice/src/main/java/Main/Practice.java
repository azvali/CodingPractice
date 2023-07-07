package Main;

import objects.Car;
import java.util.Scanner;

public class Practice {

    public static void main(String[] args) {
        
        int count;        
        Scanner scan = new Scanner(System.in);
        System.out.println("how many integers would you like to enter: \n");
        count = scan.nextInt();
        int[] arr = new int[count];
        
        
        System.out.println("Enter " + count + " integer(s)");
        for(int i = 0; i < count; i++){
            arr[i] = scan.nextInt();
        }
        
        
        //find min
        int temp = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(temp > arr[i]){
                temp = arr[i];
            }
            else{
                //do nothing
            } 
        }
        System.out.printf("the min is %d" , temp);
        // sort in ascending order
       //for(int i = 0; i < arr.length ; i++){
           // if
        //}
        
    }
}

