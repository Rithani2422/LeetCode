class Solution {
    public int[] plusOne(int[] digits) {
            int a;
        int[] b = new int[digits.length + 1];
        for (int i = digits.length - 1; i >= 0; i--) {
            
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            } else {
                digits[i] = 0;
            }
        }

        
        b[0] = 1; 
        return b;
    }
}