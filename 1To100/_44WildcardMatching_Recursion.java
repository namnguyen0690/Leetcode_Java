public class _44WildcardMatching_Recursion {
    class Solution {
        public boolean isMatch(String s, String p) {
            if (s == null || p == null)
                return false;
            Boolean[][] dp = new Boolean[s.length() + 1][p.length() + 1];
            return helper(s, 0, p, 0, dp);
        }

        public boolean helper(String s, int si, String p, int pi, Boolean[][] dp) {
            if (si == s.length() && pi == p.length())
                return true;
            if (dp[si][pi] != null)
                return dp[si][pi];

            if (si == s.length()) {
                // see if can reach the end of pattern
                if (p.charAt(pi) == '*')
                    return helper(s, si, p, pi + 1, dp);
                dp[si][pi] = false;
                return false;
            }

            // reached the end of pattern with partial match
            if (pi == p.length())
                return false;

            if (s.charAt(si) == p.charAt(pi) || p.charAt(pi) == '?') {
                // check if we can match by using greedy approach
                if (helper(s, si + 1, p, pi + 1, dp)) {
                    dp[si][pi] = true;
                    return true;
                }
            }

            if (p.charAt(pi) == '*') {
                // check if * counts as 1, 0 or multiple
                if (helper(s, si + 1, p, pi + 1, dp) || helper(s, si, p, pi + 1, dp) || helper(s, si + 1, p, pi, dp)) {
                    dp[si][pi] = true;
                    return true;
                }
            }
            dp[si][pi] = false; // nothing matched
            return false;
        }
    }

}
