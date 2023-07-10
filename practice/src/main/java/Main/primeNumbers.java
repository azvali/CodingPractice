
package Main;


public class primeNumbers {
    
    public static void prime1(){
        
        int n = 2;
        boolean isPrime = true;
        
        while(n <= 10000){
            for(int i = 2 ; i < 10000; i++){
                if(n == i){
                    continue;
                }
                else if(n % i == 0){
                    isPrime = false;
                    break;
                }
                else{
                    isPrime = true;
                }
            }
            if(isPrime){
                System.out.printf("%d " , n);
            }
            n++;
        }
    }
    public static void prime2(){
        int[] arr = new int[10000];
        
        for(int i = 1; i <= arr.length; i++){
            arr[i] = i;
        }
        System.out.printf("%d", arr[33]);
        
    }
}
