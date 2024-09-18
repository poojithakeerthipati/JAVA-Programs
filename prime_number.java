import java.util.*;

class prime_no{
    void prime(int n){
        int flag=0;
        if(n==0 || n==1){
            System.out.println("The given number is not prime number");
        }
        else{
            for(int i=2;i<n/2;i++){
                if(n%i==0){
                    System.out.println("The given number is not a prime number");
                    flag = 1;
                    break;
                }
                if(flag==0){
                    System.out.println("The given number is a prime number");
                }
            }
        }
    }
}

public class prime_number{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        sc.close();
        prime_no p = new prime_no();
        p.prime(n);
    }
}