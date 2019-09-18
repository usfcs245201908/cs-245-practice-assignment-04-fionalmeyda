public class SelectionSort implements SortingAlgorithm{
	public void sort(int[]arr){
		int n = arr.length;
		for(int i =0 ;i<n-1;i++){
			int x = i ;
			for(int j =i+1;j<n;j++){
				if(arr[j]<arr[x]){
					x=j;
				}
			}
			int s = arr[x];
			arr[x]=arr[i];
			arr[i]= s;
		}
	}
}