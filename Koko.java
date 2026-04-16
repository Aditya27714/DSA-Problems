
// Leetcode Q.875


class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        int l = 1;
        int high = 0;
        for (int pile : piles) {
            high = Math.max(high, pile);
        }

        int temp = high; 
        int mid;

        while (l <= high) {
            mid = (l + high) / 2;
            long t = 0;

            for (int i = 0; i < n; i++) {
                t += piles[i] / mid;
                if (piles[i] % mid != 0) {
                    t++;
                }
            }

            if (t <= h) {
                temp = mid;
                high = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        return temp;
    }
}
