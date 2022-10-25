package binarysearch;
import java.util.*;
public class binarysearch {
//function for search
	public static int binsearch(int[] arr, int l , int h , int element) {
		while(l<=h) {
			int m=(l+h)/2;

			if(arr[m]==element) {
				return m;
			}
			if(arr[m]>element) {
				h=m-1;
			}
			else {
				l=m+1;
			}
				
		}
		return -1;
	}
	public static void main(String[] args) {
	int[] arr= {2,3,4,10,40};
	System.out.println("enter the number");
	Scanner s=new Scanner(System.in);
	int number=s.nextInt();
	int result=binsearch(arr,0,arr.length-1,number);
	if(result==-1) {
		System.out.println("not found"); }
		else {
			System.out.println("the number found is :" + " " + arr[result] + "the index is" + " " +result);
		}

	

} }
