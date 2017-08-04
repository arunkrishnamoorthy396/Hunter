
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Hunter99 {
public static void main(String[] args) throws NumberFormatException, IOException{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	ArrayList<Integer> list = new ArrayList<Integer>();
	System.out.println("Enter the value");
	int target = Integer.parseInt(br.readLine());
	
	int count=0,i,j;
	for(i=9;i<=100;i++){
		count =0;
		for(j=2;j<=i/2;j++){
		if( i % j == 0){
			count++;
			break;
		}
	}
		if(count == 0)
		//	System.out.println(i);
		list.add(i);
	  }
	for(i=0;i<list.size();i++){
		for(j=i;j<list.size();j++){
			if( list.get(i) + list.get(j) == target ){
				System.out.println(list.get(i) +"  "+list.get(j));
			}
		}
	}
	}
}
