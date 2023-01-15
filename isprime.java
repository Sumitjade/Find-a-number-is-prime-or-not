import java.util.*;

public class isprime {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int n = sc.nextInt();

        if (n==2) {
            System.out.println("prime number");
         } else {
            
         
             boolean isprime = true;
        
             for (int i = 2; i < Math.sqrt(n); i++) { //sqrt takes low time hence it takes less time
                if (n%i==0) {
                    isprime = false;
                }
            }
        
            if (isprime==false) {
                 System.out.println("composite number");
            } else {
                System.out.println("prime number");
            }
        }
    }
    
}
