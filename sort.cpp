int main(){
	int a[10]={2,6,4,8,9,5};
	int l=6;
	for(int i=0;i<l;i++){
		cout<<a[i];
	}
	
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