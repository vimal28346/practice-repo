import java.util.*;
class Main{
	public static void main(String args[]){
		
	}
	void Selection(int arr[],int n){
		for(int i=0;i<n-2;i++){
			int min=i;
			for(int j=i+1;j<n-1;i++){
				if(arr[j]<min)
					min=j;
			}
			int temp=arr[i];
			arr[i]=arr[min];
			arr[min]=temp;
		}
	}
}