package git.com;

public class Basic {

	public static void main(String[] args) {
		int t=20,s=30;
		System.out.println("The value of t:"+t );
		System.out.println("The value of s:"+s);
		if(s+t>=60) {
			if((t+s)%2==0)
				System.out.println("sum of value is an even");
			else
				System.out.println("sum of value is an odd");
		}
		else 
			System.out.println("Above condition is false");
	}


	}

