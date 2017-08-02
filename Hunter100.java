
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Hunter100 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> list = new ArrayList<Integer>();
		System.out.println("Enter the value");
       String s1 = br.readLine();
       char[] c1 = s1.toCharArray();
        int rem=0,sum=0,s;
       for(int i=0;i<c1.length;i++){
    	   int n=c1[i]-48;
    	   if((i+1)!=c1.length)
    		   rem=c1[i+1]-48;
    	   else
    		   rem=0;
    	  s=(int) Math.pow(n,rem);
    	  sum=sum+s;
       }
       System.out.println(sum);
          
	}
}
