
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hunter75 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the size Array");
		int n= Integer.parseInt(br.readLine());
		int[] a = new int[n];
		System.out.println("Enter the Array");
		for(int i=0;i<n;i++)
		{
			a[i]= Integer.parseInt(br.readLine());
		}
		for(int i=0;i<n;i++){
			if( (i+1) != n){
			if(a[i] > a[i+1])
				System.out.println(a[i+1]);
			else
				System.out.println(-1);  }
			else
				if(a[i] > a[0])
					System.out.println(a[0]);
				else
					System.out.println(-1); 
				
				
		}
		
}
}
