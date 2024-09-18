import java.util.*;

class function{
    void palindrome(int n){
        int reverse = 0;
        int temp = n;
        while(temp>0){ 
            int r = temp%10;
            temp = temp/10;
            reverse = reverse*10+r;
        }
        if(reverse == n){
            System.out.println("The given number is palindrome");
        }
        else{
            System.out.println("The given number is not a palindrome");
        }
    }
}


public class Palindrome{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        sc.close();
        function f = new function();
        f.palindrome(n);
    }
}