package Hashing;

public class Check_Pair_Mod_k {
    public static void main(String[] args) {
        int [] arr= {21, 25, 10, 3, 17, 26};
        System.out.println(canMakePairs(arr, 10)); // Expected Output: true or false
    }

    private static boolean canMakePairs(int[] arr, int k) {
        int[] freq = new int[k];

        // Step 1: Compute frequencies of remainders
        for (int num : arr) {
            int rem = num % k;
            if (rem < 0) {
                rem += k; // Ensure positive remainder
            }
            freq[rem]++;
        }

        // Step 2: Check pairs
        if (freq[0] % 2 != 0) return false;

        for (int i = 1; i <= k / 2; i++) {
            if (freq[i] != freq[k - i]) {
                return false;
            }
        }

        // Step 3: If k is evenck , chek/2 remainder count
        if (k % 2 == 0 && freq[k / 2] % 2 != 0) {
            return false;
        }

        return true;
    }
}
