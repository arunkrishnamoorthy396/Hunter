import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hunter8 {
public static void main(String[] args) throws NumberFormatException, IOException{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter the size of array");
	int n = Integer.parseInt(br.readLine());
	int[] arr = new int[n];
	System.out.println("Enter the Array");
	for(int i=0;i<n;i++){
		arr[i] = Integer.parseInt(br.readLine());
	}
	
	for(int j=0;j<=n-1;j++){
	for(int i=j+1;i<=n-1;i++){
		for(int k=i+1;k<=n-1;k++){
		if(arr[j] + arr[i] == arr[k] ){
		System.out.println(arr[i]+" "+arr[j] +" "+arr[k]); }
	}
}
}
}
}
