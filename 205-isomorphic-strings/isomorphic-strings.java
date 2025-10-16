class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] mapS = new int[256];
        int[] mapT = new int[256];

        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            // If previously mapped positions don't match, not isomorphic
            if (mapS[c1] != mapT[c2]) return false;

            // Store current index + 1 to avoid confusion with default zero
            mapS[c1] = i + 1;
            mapT[c2] = i + 1;
        }

        return true;
    }
}
