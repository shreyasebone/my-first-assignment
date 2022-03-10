package shreya;
import java.util.*;

public class occur {
      
	public void occure(String s1,String word) {
		int count=0;
         String arr[]=s1.split(" ");
		
		for(int i=0;i<arr.length;i++)
		{
			if (word.equals(arr[i])) 
				count++;
		}	
	       System.out.println("occurence of " +word +" is " +count);
		
}

	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter article");
		String s1= sc.nextLine();
		System.out.println("enter word");
		String word=sc.nextLine();
		occur o=new occur();
		o.occure(s1, word);
	}
}
