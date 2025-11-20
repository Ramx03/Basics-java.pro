import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n =sc.nextInt();
        int m  =sc.nextInt();
        
         int lcmvalue =lcm(n,m);
         int gcdvalue=gcd(n,m);
        System.out.print(lcm(n,m)+" ");
        System.out.print(gcd(n,m)+" ");
        
    }
    public static int gcd(int a, int b){
        a=Math.abs(a);
        b=Math.abs(b);
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
    public static int lcm(int a, int b){
        return Math.abs(a*b)/gcd(a,b);
    }
}