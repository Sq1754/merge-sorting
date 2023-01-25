
public class MergeSort {
	// Q-> Sort an Array using merge sorting

	public static void conquer(int[] arr,int startIdx,int mid,int endIdx) {
		int merged[]= new int[endIdx-startIdx+1];
		int idx1 = startIdx;
		int idx2 = mid+1;
		int x =0;
		while(idx1<=mid && idx2<= endIdx) {
			if(arr[idx1]<=arr[idx2]) {
				merged[x++] = arr[idx1++];
			}else {		merged[x++]= arr[idx2++];	}
		}
		
		while(idx1<=mid) {
			merged[x]= arr[idx1];
			x++;
			idx1++;
		}
		while(idx2<=endIdx) {
			merged[x++]=arr[idx2++];
		}
		/*
		 * above 2 while loops are for putting already sorted element in merged array
		 */
		for(int i=0,j=startIdx;i<merged.length;i++,j++) {
			arr[j]=merged[i];
		}
	}
	public static void divide(int[]arr,int startIdx,int endIdx) {
		if(startIdx>=endIdx) {
			return;
		}
		
		int mid  = startIdx +(endIdx-startIdx)/2; // we can also use (startIdx+endIdx)/2  but in this case space complexity will be high
		divide(arr,startIdx,mid);
		divide(arr,mid+1,endIdx);  // now array is divided into two parts
		
		conquer(arr,startIdx,mid,endIdx);
	}
public static void main(String args[]) {
	int arr[]= {2,1,7,9,5,3,8,4,6,4,0};
	int n = arr.length;
	
	divide(arr,0,n-1);
	
	//Print
	for(int i=0;i<n;i++) {
		System.out.print(arr[i]+" ");
	}

}
}
