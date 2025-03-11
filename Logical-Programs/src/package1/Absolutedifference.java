package package1;

public class Absolutedifference {
	public static void main(String[] args) {
		int arr[] = {3,25,8,5};
		int l = arr.length;
		int elesum = 0 ;
		int digsum = 0;
		
		for(int i : arr) {
			elesum = elesum + i; 
			while(i>0) {
				digsum =digsum + i %10;
				i /= 10 ;
			}
		}
		System.out.println("All Elements in addition: "+elesum);
		
		System.out.println("Sum of the elements: "+digsum);
		int diff = elesum - digsum;
        System.out.println("Absolute Difference: " + diff);
        
        int finalValue = 0;
        while(diff>0) {
        	finalValue =finalValue + diff %10;
			diff /= 10 ;
		}
        
        
        System.out.print(finalValue);
	}
}
