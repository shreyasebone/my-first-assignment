package shreya;
import java.util.*;

public class palindromnum {
      public void palindrome(int num) {
    	  int temp=num;
  		int sum=0,rev=0;
  		while(num>0) {
  			rev=num%10;
  			sum=sum*10+rev;
  			num=num/10;
  		}
  		if(temp == sum) {
  			System.out.println("number is palindrom");
  		}else {
  			System.out.println("number is not palindrom");
  		}
      }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int num=sc.nextInt();
		palindromnum p=new palindromnum();
		p.palindrome(num);
		
	}

}
