class Solution {
    public String[] findRelativeRanks(int[] score) {
           int n = score.length;
        String[] result = new String[n];
        Map<Integer, Integer> indexMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            indexMap.put(score[i], i);
        }

    
        Arrays.sort(score);
        for (int i = 0; i < n / 2; i++) {
            int temp = score[i];
            score[i] = score[n - 1 - i];
            score[n - 1 - i] = temp;
        }

    
        for (int i = 0; i < n; i++) {
            int originalIndex = indexMap.get(score[i]);
            if (i == 0) result[originalIndex] = "Gold Medal";
            else if (i == 1) result[originalIndex] = "Silver Medal";
            else if (i == 2) result[originalIndex] = "Bronze Medal";
            else result[originalIndex] = String.valueOf(i + 1);
        }

        return result;
    }
}