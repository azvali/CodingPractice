
package smallPrograms;


public class primeNumbers {
    
    public static void prime(){
        
        int n = 2;
        boolean isPrime = true;
        
        while(n <= 10000){
            for(int i = 2 ; i < n; i++){
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
}
