package objects;


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

    @Override
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

    @Override
    public String toString() {
        return num + "/" + den;
    }
    
    public double reduce(){
        int gcd = gcd(num , den);
        num /= gcd;
        den /= gcd;
        return num / den;
    }    
    @Override
    public Object clone()throws CloneNotSupportedException {
        return super.clone();
    }
    public void setNum(int a){
        this.num = a;
    }
    public int getNum(){
        return num;
    }
    public void setDen(int a){
        this.den = a;
    }
    public int getDen(){
        return den;
    }
}
