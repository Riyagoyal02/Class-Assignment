import java.util.*;
public class SubArray {
	
	
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		System.out.println("enter size");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
			int count=0;
			n=n-k+1;
			count=n*(n+1)/2;
			System.out.println(count);
			
		
		
		// TODO Auto-generated method stub

	}

}
