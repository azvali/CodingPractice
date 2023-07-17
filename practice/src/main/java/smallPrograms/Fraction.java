/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package smallPrograms;

/**
 *
 * @author azval
 */
public class Fraction implements Cloneable{
      /** den>0 and

      num and den has no common divisor other  than 1.

   */

    private int num;

    private int den;

    private int gcd(int a, int b) {
        if (b==0) return a; 
        else return gcd(b, a%b);  
    }

    @override
    public boolean equals(Object f){
        if(this == f){
            return true;
        }
        if(f == null || getClass() != f.getClass()){
            return false;
        }
        
        Fraction other = (Fraction) f;
        return num == other.num && den == other.den;
    }

    @override
    public String toString() {
        return num + "/" + den;
    }
}
