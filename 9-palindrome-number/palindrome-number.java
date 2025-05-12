class Solution {
    public boolean isPalindrome(int x) {
       if (x < 0) {
            return false;
        }

        int original = x;
        int reversed = 0;

        while (x != 0) {
            int digit = x % 10;

            // Overflow check (optional for this problem, but safe)
            if (reversed > Integer.MAX_VALUE / 10 || (reversed == Integer.MAX_VALUE / 10 && digit > 7)) {
                return false;
            }

            reversed = reversed * 10 + digit;
            x = x / 10;
        }

        return reversed == original;
    }
        
    }
