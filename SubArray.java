import java.util.*;
public class SubArray {
	
	
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter size");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		int k=sc.nextInt();
			int count=(int)((n-k+1)*(n-k+2)/(2.0));
			System.out.println(count);
			
		
		
		// TODO Auto-generated method stub

	}

}
