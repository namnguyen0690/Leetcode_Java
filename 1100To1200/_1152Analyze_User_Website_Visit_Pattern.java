import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class _1152Analyze_User_Website_Visit_Pattern {
    class Solution {
        public List<String> mostVisitedPattern(String[] username, int[] timestamp, String[] website) {
            int n = timestamp.length;
            List<List<String>> sessions = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                sessions.add(new ArrayList<>());
                sessions.get(i).add(username[i]);
                sessions.get(i).add("" + timestamp[i]);
                sessions.get(i).add(website[i]);
            }
            sessions.sort((a, b) -> Integer.parseInt(a.get(1)) - Integer.parseInt(b.get(1)));

            Map<String, List<String>> visited = new HashMap<>();
            for (int i = 0; i < n; i++) {
                visited.putIfAbsent(sessions.get(i).get(0), new ArrayList<>());
                visited.get(sessions.get(i).get(0)).add(sessions.get(i).get(2));
            }

            Map<String, Integer> sequenceMap = new HashMap<>();
            int maxCount = 0;
            String maxseq = "";
            for (String name : visited.keySet()) {
                List<String> list = visited.get(name);
                if (list.size() < 3)
                    continue;
                Set<String> subsequences = getSubsequences(list);
                for (String seq : subsequences) {
                    int count = sequenceMap.getOrDefault(seq, 0) + 1;
                    sequenceMap.put(seq, count);
                    if (count > maxCount) {
                        maxCount = count;
                        maxseq = seq;
                    } else if (count == maxCount && seq.compareTo(maxseq) < 0) {
                        maxseq = seq;
                    }
                }
            }

            String[] strs = maxseq.split(",");
            List<String> res = new ArrayList<>();
            for (String s : strs) {
                res.add(s);
            }

            return res;
        }

        public Set<String> getSubsequences(List<String> list) {
            int n = list.size();
            Set<String> res = new HashSet<>();
            for (int i = 0; i < n - 2; i++) {
                for (int j = i + 1; j < n - 1; j++) {
                    for (int k = j + 1; k < n; k++) {
                        res.add(list.get(i) + "," + list.get(j) + "," + list.get(k));
                    }
                }
            }
            return res;
        }
    }

}
