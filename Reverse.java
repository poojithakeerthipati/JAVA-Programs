import java.util.*;
public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        sc.close();
        int temp = n;
        int reverse = 0;
        while(temp!=0){
            int reminder = temp%10;
            temp = temp/10;
            reverse = reverse*10 + reminder;
        }
        System.out.println("The reverse of the given number "+n+" is: "+reverse);
    }
}
