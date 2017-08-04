package Hunter;

import java.io.*;
import java.util.*;
public class Hunter97 {
public static void main(String[] args)throws IOException{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter the String");
	String str = br.readLine();
	
	//String[] s1 = str.split(" ");
	String s2 = "";
	System.out.println(s2);
	//for(int i=0;i<s1.length;i++){
		
		// if(s1[i] == "smiling" || s1[i] == "smiles" || s1[i] == "smiled"){
			s2= str.replace("smiling", "barks once");
			 s2= s2.replace("smiled", "barks once");
			 s2= s2.replace("smiles", "barks once");
			 s2= s2.replace("crying", "barks twice");
			  s2= s2.replace("cries", "barks twice");
			  s2= s2.replace("cry", "barks twice");
			  s2= s2.replace("cried", "barks twice");
			  s2= s2.replace("fearing", "barks thrice");
			  s2= s2.replace("feared", "barks thrice");
			  s2= s2.replace("fear", "barks thrice");
			//s1[i] = "barks once";
			System.out.println(s2);
		
			
   
  }
 }
