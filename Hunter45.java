package Hunter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hunter45 {
public static void main(String[] args) throws NumberFormatException, IOException{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int i,j,k;
	System.out.println("Enter the size of array");
	int size = Integer.parseInt(br.readLine());
	String[] str = new String[size];
	System.out.println("Enter the array");
	for(i=0;i<size;i++){
		str[i] = br.readLine();
	}
	int count=0;
	for( j=0;j<size;j++ ){
		count=0;
		for(k=0;k<size;k++){
			if(str[j].equals(str[k]))
				count++;
			
		}
	if(count == 1){
		System.out.println(str[j]);
	break;}
	}
	
}
}
