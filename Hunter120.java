package Hunter;

import java.awt.List;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Hunter120 {
public static void main(String[] args) throws IOException{
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	ArrayList<String> l1 = new ArrayList<String>();
	ArrayList<String> l2 = new ArrayList<String>();
	System.out.println("Enter the String");
	String str = br.readLine();
	int n = str.length();
	
	int i,start,j;
	for(i=2;i<=n;i++){
		start =0;
		int ss=i;
		int length =  n-(ss-1);
		for(j=0;j<length;j++){
		
		String s1 = str.substring(start,ss);
		System.out.println(s1);
		start++;
		ss++;
		l1.add(s1);
	}
	
}
	for(int i1=0;i1<l1.size();i1++){
		String rev=l1.get(i1);
		StringBuffer sb = new StringBuffer(rev);
		sb.reverse();
		if(rev.equals(sb.toString()))
			l2.add(l1.get(i1));
		
	}
	System.out.println(l2.get(0));
	
}
}
