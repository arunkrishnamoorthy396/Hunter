package Hunter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hunter103 {
public static void main(String[] args) throws NumberFormatException, IOException{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int sum=0;
	int sum1=1;
	System.out.println("Enter the value");
	String num = br.readLine();
	char[] c1 = num.toCharArray();
	for(int i=0;i<c1.length;i++){
		sum1=1;
		for(int j=0;j<num.length();j++){
			sum1 = (sum1 * (c1[i]-48));
		}
		//System.out.println(sum1);
		sum=sum+sum1;
	}
	// System.out.println(sum);
	 System.out.println(sum);
}
}
