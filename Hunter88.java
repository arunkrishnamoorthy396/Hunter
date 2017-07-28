import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.HashSet;

import org.omg.CORBA_2_3.portable.InputStream;

public class Hunter88 {
public static void main(String[] args) throws IOException{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter the String");
	String str = br.readLine();
	HashSet<Character> hs = new HashSet<Character>();
	char[] c1 = str.toCharArray();
	for(int i=str.length()-1;i>=0;i--){
		hs.add(c1[i]);
	}
//	System.out.println(hs);
	for(char a : hs){
		System.out.println(a);
	}
}
}
