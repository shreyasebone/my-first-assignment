package shreya;
import java.util.*;


public class occur {

	public static void main(String[] args) {
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter article");
		String s1= sc.nextLine();
		System.out.println("enter word");
		String word=sc.nextLine();
		String arr[]=s1.split(" ");
		
		for(int i=0;i<arr.length;i++)
		{
			if (word.equals(arr[i])) 
				count++;
		}	
	       System.out.println("occurence of " +word +" is " +count);
		
		}
		

	}


