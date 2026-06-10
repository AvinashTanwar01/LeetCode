class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        String[] answers = new String[n];

        Integer[] indexs = new Integer[n];
        for (int i = 0; i < n; i++) {
            indexs[i] = i;
        }
        Arrays.sort(indexs, (a, b) -> score[b] - score[a]);

        for (int rank = 0; rank < n; rank++) {
            if (rank == 0)
                answers[indexs[rank]] = "Gold Medal";
            else if (rank == 1)
                answers[indexs[rank]] = "Silver Medal";
            else if (rank == 2)
                answers[indexs[rank]] = "Bronze Medal";
            else
                answers[indexs[rank]] = String.valueOf(rank + 1);
        }

        return answers;
    }
}