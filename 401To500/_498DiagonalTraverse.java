package com.nami.solutions.from401to500;

public class _498DiagonalTraverse {
    class Solution {
        public int[] findDiagonalOrder(int[][] mat) {
            if (mat == null || mat.length == 0) return new int[0];
            int n = mat.length;
            int m = mat[0].length;

            int[] result = new int[n*m];
            int t = 0;
            ArrayList<Integer> tmp = new ArrayList<Integer>();

            for (int i = 0; i < n + m -1; i++){
                tmp.clear();
                int r = i < m ? 0 : i - m + 1;
                int c = i < m ? i : m - 1;

                while (r < n && c > -1) {
                    tmp.add(mat[r][c]);
                    ++r;
                    --c;
                }
                if (i % 2 == 0){
                    Collections.reverse(tmp);
                }

                for (int k = 0; k < tmp.size(); k++){
                    result[t++] = tmp.get(k);
                }
            }
            return result;
        }
    }
}
