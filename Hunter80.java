import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hunter80 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = 0;
		System.out.println("Enter the Number");
		String num = br.readLine();
		int n = Integer.parseInt(num);
	
		
		if(n <= 10){
			for(int i=1;i<n;i++){
				System.out.println(i);
			}
		}
		
		if( n > 11){
		
		for(int i=1;i<=10;i++){
			System.out.println(i);
		}
				for(int j=11;j<n;j++){
					count =0;
					String number = String.valueOf(j);
					
					char[] c1 = number.toCharArray();
					for(int k=0;k< c1.length-1;k++){
						
					//	System.out.println(c1[k]-c1[k+1]);
				if( Math.abs( c1[k]-c1[k+1])==1 )
					count++; }
				if(count == (c1.length -1))
			System.out.println(j);
					
		}
		
}
}
}

