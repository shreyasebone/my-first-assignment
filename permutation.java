package shreya;
import java.io.*;
import java.util.*;

public class permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		printpermutations(s,"");

	}
	public static void printpermutations(String str,String ans ) {
		if(str.length()==0) {
			System.out.println(ans);
			return;
		}
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			String sl=str.substring(0, i);
			String sr=str.substring(i+1);
			String res=sl+sr;
			printpermutations(res,ans+ch);
		}
		
	}

}
