package task2.collection.me;

//sulthan program
public class WaterDistribution {
    public static int remainingWater(int N, int K, int M, int[] A, int[] B) {
        int totalRequiredWater = 0;

        for (int i = 0; i < N; i++) {
            totalRequiredWater += M; 
            totalRequiredWater += A[i] * B[i]; 
        }

        if (totalRequiredWater > K) {
            return 0;
        }
        return K - totalRequiredWater; 
    }

    public static void main(String[] args) {
        // Example Input
        int N = 3;
        int K = 150;
        int M = 5;
        int[] A = {2, 3, 1};
        int[] B = {10, 20, 15};

        // Call function and print result
        System.out.println(remainingWater(N, K, M, A, B)); // Output remaining water
    }
}