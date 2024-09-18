import java.util.Scanner;
class Fibonacci{
    void fib(int n){
        if(n<=0){
            System.out.println();
        }
        else if(n==1){
            System.out.println(0);
        }
        else{
            int first = 0; //n==1
            int second = 1; //n==2
            System.out.println(first);
            System.out.println(second);
            while((n-2)>0){
                int last = first + second ;
                System.out.println(last);
                n--;
                first = second;
                second = last;

            }
        }
    }
}


public class Fibonacci_series{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        sc.close();
        Fibonacci fb = new Fibonacci();
        fb.fib(n);

    }
}