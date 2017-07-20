package Hunter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hunter65 {
public static void main(String[] args) throws NumberFormatException, IOException{
	BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
	int[] a = new int[6];
	int[] b = new int[6];
	int i,j;
	System.out.println("Enter the array");
	for(i=0;i<6;i++){
		a[i]=Integer.parseInt(br.readLine());
	}
	System.out.println("Enter the want to remove");
	int remove = Integer.parseInt(br.readLine());
	
	for( j=0;j<6;j++){
		if(remove != a[j])
			b[j] = a[j];
	//	break;
	
	//System.out.println(b[j]);
	//break;
}
	for(int k=0;k<6;k++){
		if(b[k] > 0)
			System.out.println(b[k]);
	}
}
}
