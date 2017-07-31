import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hunter10 {
public static void main(String[] args) throws NumberFormatException, IOException{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int m,n;
	int count = 0;
	System.out.println("Enter the size of first array");
	int n1 = Integer.parseInt(br.readLine());
	int[] arr1 = new int[n1];
	System.out.println("Enter the size of second array");
	int n2 = Integer.parseInt(br.readLine());
	int[] arr2 = new int[n2];

	System.out.println("Enter the first Array");
	for(int i=0;i<n1;i++){
		arr1[i] = Integer.parseInt(br.readLine());
	}
	
	System.out.println("Enter the second Array");
	for(int i=0;i<n2;i++){
		arr2[i] = Integer.parseInt(br.readLine());
	}
	
	for (int i = 0; i < arr2.length; i++) {
		int a=arr2[i];
	    for (int j = 0; j < arr1.length; j++) {
	    	int b=arr1[j];
	        if (a==b) {
	            count++;
	            break;
	        }
	    }
	}
	if (count == arr2.length)
	    System.out.println("is a subset");
	else
	    System.out.println("is not a subset");
	}
}
