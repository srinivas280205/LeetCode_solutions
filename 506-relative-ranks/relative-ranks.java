class Solution {
    public String[] findRelativeRanks(int[] score) {

        int n = score.length;
        String[] res = new String[n];
        int[] sorted = score.clone();  // clone to sort without changing original
        Arrays.sort(sorted);           // sort ascending

        HashMap<Integer, String> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int rank = n - i;  // highest score gets rank 1
            if (rank == 1) map.put(sorted[i], "Gold Medal");
            else if (rank == 2) map.put(sorted[i], "Silver Medal");
            else if (rank == 3) map.put(sorted[i], "Bronze Medal");
            else map.put(sorted[i], String.valueOf(rank));
        }

        for (int i = 0; i < n; i++) {
            res[i] = map.get(score[i]);  // map original score to its rank
        }

        return res;
        
    }
}