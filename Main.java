package codefores;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.lang.*;
public class Main {
	public static Bi b=new Bi();
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("if need to addd 2 numbers enter 1 ");
		System.out.println("if need to get factorial of number  enter 2 ");
		System.out.println("if need to mult 2numbers   enter 3 ");
		int n=input.nextInt();
		String takeline=input.nextLine();
		if(n==1){
			String nu1=input.nextLine();
			String nu2=input.nextLine();
			int maxlenght=Math.max(nu1.length(), nu2.length());
			
			if(maxlenght>nu1.length()){
				nu1=b.make_the_same_lenght(nu1, maxlenght);
			}
			if(maxlenght>nu2.length()){
				nu2=b.make_the_same_lenght(nu2, maxlenght);
			}
			int [] arr1=new int[nu1.length()];
			int [] arr2=new int[nu2.length()];
			arr1=b.make_Arry(nu1);
			arr2=b.make_Arry(nu2);
			b.add(arr1, arr2);
		}else if(n==2){
			int t=input.nextInt();
			b.facorail(t);
		}else if(n==3){
			String nu1=input.nextLine();
			String nu2=input.nextLine();
			nu1=b.revr(nu1);
			nu2=b.revr(nu2);
			b.mul(nu1, nu2);
			
		}
		
		
	
		
}
}