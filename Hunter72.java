import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hunter72 {
public static void main(String[] args) throws IOException{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter the String");
	String str = br.readLine();
	String[] s1 = str.split(" ");
	
	for(int i=0;i<s1.length;i++){
		if((i+1)%2!=0){
		StringBuffer sb = new StringBuffer(s1[i]);
		sb.reverse();
		System.out.print(sb+" ");
		}
		else
			System.out.print(s1[i]+" ");
	}
	
}
}
