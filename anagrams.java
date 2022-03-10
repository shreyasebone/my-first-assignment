package shreya;
import java.util.*;
public class anagrams {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first string");
		String s1=sc.next();
		
		System.out.println("enter second string");
		String s2=sc.next();
		
		char a[]=s1.toLowerCase().toCharArray();
		char b[]=s2.toLowerCase().toCharArray();
		
		Arrays.sort(a);
		Arrays.sort(b);
		boolean result=Arrays.equals(a,b);
		if(result==true)
		{
			System.out.println("string is anagram");
			
		}else
		{
			System.out.println("string is not anagram");
		}

	}

}
