package Hunter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hunter60 {
public static void main(String[] args) throws NumberFormatException, IOException{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	int[] a = new int[6];
	int[] b = new int[6];
	int count = 0,k;
	System.out.println("Enter the first array");
	for(int i=0;i<6;i++){
		a[i] = Integer.parseInt(br.readLine());
	}
	
	
	System.out.println("Enter the second array");
	for(int j=0;j<6;j++){
		b[j] = Integer.parseInt(br.readLine());
	}
	
	for(k=0;k<6;k++){
		//count= 0;
		if(b[0] == a[k])
			count = k+1;
		//k++;
		//break;
	}
	System.out.println(count);
	
}
}
