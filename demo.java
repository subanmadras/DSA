package DSA;

class demo{
    public static void main(String args[]){
        int n=1221;
        int num =n; ;
        int rev = 0;
        while(n!=0){
            int rem = n %10;
            rev = rev * 10 + rem;
           n = n/10;
        }
        if(rev == num)
        System.out.println(" number  : "+ rev +" is plaindrome ");
        else
        System.out.println(" number  : "+ rev +" is not a plaindrome ");
    }
}