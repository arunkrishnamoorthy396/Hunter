import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hunter82 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int i,j,max=0;
		System.out.println("Enter the size of the array");
		int n = Integer.parseInt(br.readLine());
		int[] n1 = new int[n];
		System.out.println("Enter the size of the array");
		for( i=0;i<n;i++){
	    n1[i] = Integer.parseInt(br.readLine());
		}
		for(j=0;j<n-1;j++){
			if(n1[j] == n1[j+1]){
				n1[j] =0;
			}
		}
		for(j=0;j<n;j++){
			if(n1[j] !=0)
      	System.out.println(n1[j]);
		}
		max=n1[0];
		for(i=0;i<n;i++){
			if(n1[i] > max )
				max = n1[i];
		}
		
		System.out.println("\n Greatest value " +max);
		
}
}
