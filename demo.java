package DSA;
import java.util.*;

class demo{
    static boolean checkPrime(int n){
        for(int i=2; i<n; i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
    int n=3;
    if(checkPrime(n)==true)
    System.out.println("prime");
    else 
    System.out.println("not prime");
    }
}