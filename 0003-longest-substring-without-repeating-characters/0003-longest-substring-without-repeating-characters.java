class Solution {
    public int lengthOfLongestSubstring(String s) {
        boolean[] seen = new boolean[128];

int left = 0, max = 0;

for (int right = 0; right < s.length(); right++) {

    while (seen[s.charAt(right)]) {
        seen[s.charAt(left)] = false;
        left++;
    }

    seen[s.charAt(right)] = true;
    max = Math.max(max, right - left + 1);
}
return max;

    }
}