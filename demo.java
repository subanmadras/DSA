package DSA;
import java.util.*;

class demo{
    public static void main(String args[]){
        // int n=1221;
        // int num =n; ;
        // int rev = 0;
        // while(n!=0){
        //     int rem = n %10;
        //     rev = rev * 10 + rem;
        //    n = n/10;
        // }
        // if(rev == num)
        // System.out.println(" number  : "+ rev +" is plaindrome ");
        // else
        // System.out.println(" number  : "+ rev +" is not a plaindrome ");

        //gcd of two numbers
        // int n1 =  3;
        // int n2 = 6;
        // int ans = 1;
        // for(int i=1; i<=Math.min(n1,n2); i++){
        //     if(n1%i == 0 && n2%i == 0)
        //     ans = i;
        // }
        // System.out.println("the gcd is "+ans);
        //armstrong number
    //     int n = 153;
    //     int og =n;
    //     int ans= 0;
    //     while(n!=0){
    //         int dig = n % 10;
    //         ans = ans+(int)Math.pow(dig,3);
    //         n = n/10;
    //     }
    //     if(og == ans)
    //    System.out.println("armstrong number");
    //    else  System.out.println("not an armstrong number");
    //print all divisors
    int n=36;
    for(int i=1; i<=n; i++){
        if(n%i ==0){
            System.out.println(i);
        }
    } 
    }
}