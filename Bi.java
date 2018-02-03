package codefores;

import java.util.ArrayList;

public class Bi {
    public String make_the_same_lenght(String t,int l){
    	int rem=l-t.length();
    	String j="";
    	for(int i=0;i<rem;i++){
    		j+="0";
    	}
    	return j+t;
    }
	public int[] make_Arry(String t){
		int [] arr=new int[t.length()];
		int j=0;
		for(int i=0;i<t.length();i++){
			arr[j]=Character.getNumericValue(t.charAt(i));
			j++;
		}
		return arr;
	}
	//add
	public int [] add(int [] n1, int []  n2){
		String re="";
		int [] r=new int[n1.length];
		int carry=0,pos=n1.length-1;
		for(int i=n1.length-1;i>=0;i--){
			int t=n1[i]+n2[i]+carry;
			System.out.println(n1[i]+" "+ n2[i]);
			if(t<10){
				r[i]=t;
				carry=0;
			}else{
				if(i==0){
					r[i]=t;
				}else{
					r[i]=t%10;
					carry=t/10;
				}
				
			}
		}
		for(int i=0;i<n1.length;i++){
			System.out.print(n1[i]);
		}
		System.out.print(" + ");
		for(int i=0;i<n2.length;i++){
			System.out.print(n2[i]);
		}
		System.out.print("  = ");
		for(int i=0;i<r.length;i++){
			System.out.print(r[i]);
		}
		System.out.println();
		return r;
	}
	//factorial
	public int [] check_good_arr_for_factorial(int [] n ){
		for(int i=0;i<n.length;i++){
			if(n[i]>=10){
				int num=n[i]/10;
				int rem=n[i]%10;
				n[i]=rem;
				n[i+1]=n[i+1]+num;
			}
		}
		return n;
	}
	public int [] facorail(int n  ){
		 double digits = 0;
	        for (long i=2; i<=n; i++)
	            digits += Math.log10(i);
	        int res=(int) (Math.floor(digits) + 1);
	        int [] r=new int[res];
	    //    System.out.println(res);
	        r[0]=1;
	        for (int i=2; i<=n; i++){
	        	for(int j=0;j<r.length;j++){
	        		r[j]=r[j]*i;
	        	}
	        	
	        	r=check_good_arr_for_factorial(r);
	        	
	        }
	    	System.out.print("factorial "+ n + " = " );
			for(int i=r.length-1;i>=0;i--){
				System.out.print(r[i]);
			}
			System.out.println();
		return r;
	}
    public String revr(String x){
    	        String t="";
    	        for(int i=x.length()-1;i>=0;i--){
    	        	t+=x.charAt(i);
    	        }
    	        return t;
    }
	//mul
		public int [] mul(String n1 , String  n2 ){
			int MXN = 600 ;
			
			int [] r=new int[MXN];
			for(int i=0;i<MXN;i++){
				r[0]=0;
			}
			for(int i=0;i<n1.length();i++){
				for(int j=0;j<n2.length();j++){
					int s1=Character.getNumericValue(n1.charAt(i));
					int s2=Character.getNumericValue(n2.charAt(j));
					r[i+j]+=(s1*s2);

				}
			}
			for (int i=0; i<MXN - 1; i++) {
				r[i + 1] += r[i] / 10;
				r[i] %= 10;
			}
			int i = MXN - 1;
			while (i > 0 && r[i] == 0) i--;
			for (; i>=0; i--) System.out.print(r[i]);
			System.out.println();

			
			return r;
		}
}
