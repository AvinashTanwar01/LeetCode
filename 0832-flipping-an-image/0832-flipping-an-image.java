class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for (int[] row : image) {
            int l = 0, r = row.length - 1;
            while (l <= r) {
                if (row[l] == row[r]) {
                    row[l] ^= 1;
                    if (l != r) row[r] ^= 1;
                } 
                l++;
                r--;
            }
        }
        return image;
    }
}