
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hunter92 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the String");
		String str = br.readLine();
		String s1 = str.replaceAll("\\s+"," ");
		System.out.println(s1);
}
}
