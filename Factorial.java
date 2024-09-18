import java.util.*;

class Fact{
    void factorial(int n){
        int  i=1;
        int fact=1;
        while(i<=n){
            fact *= i;
            i++;
            
        }
        System.out.println("The factorial of "+n+" is: "+fact);
    }
}



public class Factorial{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to get the factorial: ");
        int n = sc.nextInt();
        sc.close();
        Fact f = new Fact();
        f.factorial(n);
    }
}