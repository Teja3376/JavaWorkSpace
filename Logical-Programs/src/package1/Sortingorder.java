package package1;

//check if an array is sorted or not and return the boolean output
public class Sortingorder {
	public static void main(String[] args) {
		int arr[] = {1,2,3,3,4,5,3};
		int l = arr.length;
		System.out.println(isvalid(arr,l));
		}
	
	public static boolean isvalid (int []arr,int l) {
		for(int i = 1;i<l;i++) {
			if(arr[i]==arr[i-1]) {
				return false;
			}
		}
			return true;
	}	
	
	
	
	
	
	
	
	
//	public static void main(String[] args) {
//		int arr[] = { 1,2,3,4,5,6,7,7};
//		int l = arr.length;
//		System.out.println(sort(arr,l));
//	}
//
//	public static boolean sort(int [] arr, int l) {
//		for (int i = 1; i < l; i++) {
//			if (arr[i] < arr[i - 1]) {
//				return false;
//			}
//		}
//		return true;
//	}
}
