import java.util.*;

class CheckArmstrong{
    void armstr(int n){
        int sum = 0;
        int len = 0;
        int temp=n;
        int temp1=n;
        while(temp!=0){
            len++;
            temp = temp/10;
        }
        while(temp1!=0){
            int r = temp1%10;
            temp1 = temp1/10;
            sum += Math.pow(r,len);    
        }
        if(sum==n){
            System.out.println("The given number is a armstrong number");
        }
        else{
            System.out.println("The given number is not a armstrong number");
        }
    }
}



public class Armstrong{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n = sc.nextInt();
        sc.close();
        CheckArmstrong ca = new CheckArmstrong();
        ca.armstr(n);
    }
}