package package1;
//Find the no.of occurrences of each element in an array

public class Occurrences1 {
	public static void main(String[] args) {
		int arr[] = {1,1,2,2,3,3,4,4,6,4,2};
		int freq[] = new int [arr.length];
		int visibility = -1;
		for(int i = 0 ; i<arr.length;i++) {
			int count = 1;
			for( int j=i+1 ; j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					freq[j] = visibility; // freq[0] = -1
					count++; //count = 2
				}
				
			}
			if(freq[i]!=visibility) {
				freq[i]= count; 
			}
		}
		for(int i = 0;i<freq.length;i++) {
			if(freq[i]!=visibility) {
				System.out.println(arr[i]+"  ||   "+freq[i]);
			}
		}
	}
	
	
	
	
	
//	public static void main(String[] args) {
//		int arr[] = { 1, 2, 3, 4, 5, 6, 3, 4 };
//		int freq[] = new int[arr.length];
//		int visited = -1;
//
//		for (int i = 0; i < arr.length; i++) {
//			int count = 1;
//			for (int j = i + 1; j < arr.length; j++) {
//				if (arr[i] == arr[j]) {
//					count++;
//					freq[j] = visited;
//				}
//			}
//			if (freq[i] != visited) {
//				freq[i] = count;
//			}
//		}
//
//		System.out.println("Element || Frequency");
//		for (int i = 0; i < freq.length; i++) {
//			if (freq[i] != visited) {
//				System.out.println("   " + arr[i] + "    ||    " + freq[i]);
//			}
//		}
//	}
}
