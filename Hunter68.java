package Hunter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Hunter68 {
public static void main(String[] args) throws NumberFormatException, IOException{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter the size of the array");
	int n=Integer.parseInt(br.readLine());
	int[] a = new int[n];
	int i,j,dif;
	ArrayList<Integer> list =new ArrayList<Integer>();
	System.out.println("Enter the array");
	for( i=0;i<n;i++){
		a[i] = Integer.parseInt(br.readLine());
	}
	
	for( j=0;j<n;j++){
		if(j+1!=n){
		list.add(Math.abs(a[j] - a[j+1]));
		}
	}
	  int max=Collections.max(list);
	for(i=0;i<a.length;i++){
		if(i+1!=n){
			dif = Math.abs(a[i] - a[i+1]);
			if(dif==max){
				System.out.println("OUTPUT : "+i);
				break;
			}
	}}
	}
}
