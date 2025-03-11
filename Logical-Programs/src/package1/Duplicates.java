package package1;

import java.util.Arrays;

public class Duplicates {
public static void main(String[] args) {
	int arr[] = {1,2,1,3,4,5,6};
	int arr2[] = new int[arr.length];
	int count = 0;
//	int temp = 0;
//	for(int i = 0 ; i<arr.length;i++) {
//		for(int j= i+1;j<arr.length;j++) {
//			if(arr[i]>arr[j]) {
//				temp= arr[i];
//				arr[i]=arr[j];
//				arr[j]=temp;
//			}
//		}
//		System.out.print(arr[i]);
//	}  
	
	Arrays.sort(arr);
	//sorted the array
	for(int i = 0;i<arr.length;i++) {
		if(i > 0 && arr[i] == arr[i - 1])
			continue;
		else {
			arr2[count] = arr[i];
			count++;
		}
//		System.out.println(arr[count]);
	}
		int arr3[] = Arrays.copyOf(arr2, count);
		for(int k : arr3) {
			System.out.println(k);
		}
	
}
}
