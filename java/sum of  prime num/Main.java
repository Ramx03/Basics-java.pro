import java.util.Scanner;
public class Main
{
    public static boolean prime(int n){
        for(int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n =sc.nextInt();
	    int sum=0;
	    for(int i=2;i<=n;i++){
	        if(prime(i)){
	            sum+=i;
	        }
	    }System.out.print(sum);
	}
}