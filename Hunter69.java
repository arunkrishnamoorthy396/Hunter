package Hunter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hunter69 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int s=0,s9=0,s8=0,s7=0;
		int count=0;
		System.out.println("Enter the Email id");
		String id = br.readLine();
		char[] c1 = id.toCharArray();
	
		String[] s2 = id.split("@");
		if(s2[0].length() >= 3){
			s=1;
			if(id.endsWith(".com")){
				s9=1;
				for(int i=0;i<c1.length;i++){
					if(c1[i] == '@'){
						count++;
					}
				}
				//System.out.println(count);
				
				if(count == 1)
					s8=1;
				
			}
			//System.out.println(s2[1]);
			String[] sp = s2[1].split("[.]");
		//	System.out.println(sp[0]);
			if(sp[0].length() >=4){
				s7=1;
			}
			
		}
		
		
		
			
		
		if(s==1 && s9==1 && s8==1 && s7==1){
			System.out.println("valid");
		}
		else
			System.out.println("Invalid");
		
		
		
	}
}
