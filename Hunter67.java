package Hunter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hunter67 {
public static void main(String[] args) throws IOException{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	int i,j,sum=0,sum1=0;
	System.out.println("Enter the String");
    String s1 = br.readLine();
    String s2 = br.readLine();
    String [] s=s1.split("[a-z,#]");
    for(String word:s){
    	try{
    	sum=(sum+(Integer.valueOf(word)));
    	
    	}
    	catch(NumberFormatException e){}
    }
  //  System.out.println(sum);
  
    
    String [] s3=s2.split("[a-z,#]");
    for(String word1:s3){
    	try{
    	sum1=(sum1+(Integer.valueOf(word1)));
    	
    	}
    	catch(NumberFormatException e){}
    }
    //System.out.println(sum1);
	
    String [] name1=s1.split("[0-9,#]");
    String [] name2=s1.split("[0-9,#]");
    
    
    
    if(sum > sum1)
    	for(String nam1 : name1){
   	System.out.println(nam1); }
   else
	   for(String nam2 : name2){
    	System.out.println(nam2);   }
}
}
