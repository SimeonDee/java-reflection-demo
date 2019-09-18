
package ReflectionImplementation;

import java.lang.reflect.Method;

public class ReflectionClass {
    public static void main(String[] args){
        try{
            System.out.println("ADEYEMI ADEDOYIN SIMEON -- 209188\n");
            System.out.println("REFLECTION");
            System.out.println("----------\n");
            Class reflectedClass1 = BankAccount.class;
            Class reflectedClass2 = Integer.class;
            Class reflectedMath = MyMath.class;
            System.out.println("Class1 Name: " + reflectedClass1.getName());
            System.out.println("Class2 Name: " + reflectedClass2.getName());
            System.out.println("Class3 Name: " + reflectedMath.getName());
            
            Object obj = reflectedMath.newInstance();
            Method method1 = reflectedMath.getDeclaredMethod("factorial", 
                    new Class[]{int.class});
            Method method2 = reflectedMath.getDeclaredMethod("sumOfAP", 
                    new Class[]{int.class, int.class,int.class});
            
            method1.setAccessible(true);
            method2.setAccessible(true);
            
            //Invoking factorial(int) Method through Reflection
            System.out.println("\nfactorial() method invoked through Reflection"
                    + " with 12 as argument");
            int fact =  Integer.parseInt(method1.invoke(obj, 12).toString());
            System.out.println("The factorial of 12 = " + fact);
            
            //Invoking sumOfAP(int, int, int) Method through Reflection
            System.out.println("\nsumOfAP(x,y,z) method invoked through Reflection"
                    + " with 7,20,5 as arguments");
            int sumAP = Integer.parseInt(method2.invoke(obj, 7,20,5).toString());
            System.out.println("Given that a = 7, n = 20 and d = 5, \n"
                    + "The sum of Ap = " + sumAP);
            
            
            
        
        } catch(InstantiationException ex1){
            System.out.println("Class cannot be instantiated");
        } catch(IllegalAccessException ex2){
            System.out.println("Illegal Access Exception Thrown");
        } catch(Exception e){
            System.out.println("Oops! " + e.getMessage());
        }  
    }
   
}
