package Main;

import java.util.Scanner;

public class Practice {

    public static void main(String[] args) {
        //get length of list
        int count;        
        Scanner scan = new Scanner(System.in);
        System.out.println("how many integers would you like to enter: \n");
        count = scan.nextInt();
        int[] arr = new int[count];
        
        //take input for list
        System.out.println("Enter " + count + " integer(s)\n");
        for(int i = 0; i < count; i++){
            arr[i] = scan.nextInt();
        }
        
        
        //sort in ascending order
        System.out.printf("ascending order is \n");
        int temp;
        for(int i = 0; i < arr.length ; i++){
            for(int n = 0 ; n < arr.length; n++){
                if(arr[i] < arr[n]){
                    temp = arr[i];
                    arr[i] = arr[n];
                    arr[n] = temp;
                }
                else{
                    //do nothing                   
                }
            }
        }
        //output the ascending order
        for(int i = 0 ; i < arr.length; i++){
            System.out.printf("%d ", arr[i]);
            if((i+1) % 10 == 0){
                System.out.println("\n");
            }
        }
       //primeNumbers.prime1();
        
    }
}

