class Solution {
    public int[] productExceptSelf(int[] nums) {
        int N = nums.length;
        int[] l = new int[N];
        int[] r = new int[N];
        int[] result = new int[N];
        l[0] = 1;
        for (int i = 1; i < N; i++) {
            l[i] = l[i - 1] * nums[i - 1];
        }
        r[N - 1] = 1;
        for (int i = N - 2; i >= 0; i--) {
            r[i] = r[i + 1] * nums[i + 1];
        }
        for (int i = 0; i < N; i++) {
            result[i] = l[i] * r[i];
        }
        return result;
    }
}