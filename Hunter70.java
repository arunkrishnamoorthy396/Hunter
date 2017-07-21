package Hunter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hunter70 {
public static void main(String[] args) throws NumberFormatException, IOException{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter the value of n");
	int n = Integer.parseInt(br.readLine());
	System.out.println("Enter the value of m");
	int m = Integer.parseInt(br.readLine());
	System.out.println("Enter the value of target");
	int tar = Integer.parseInt(br.readLine());
	int[] a = new int[n];
	int sum=0;
	int i,j;
	System.out.println("Enter the array");
	for(i=0;i<n;i++){
	 a[i] = Integer.parseInt(br.readLine());
	}
	
	for(j=0;j<m;j++){
			sum=sum+a[j];
	}
	
	if(sum == tar)
		System.out.println("True");
	else
		System.out.println("False");
	
	
}
}
