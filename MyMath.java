
package ReflectionImplementation;
public class MyMath {
    public long factorial(int n){
        long fact = 1;
        if(n == 0 || n == 1) return 1;
        
        for(int i = n; i >= 1; i--){
            fact *= i;
        }
        
        return fact;
    }
    
    public int sumOfAP(int firstTerm, int numb, int commonDiff){
        return ((numb / 2) + (2 * firstTerm + (numb-1)*commonDiff));
    }
    
}
