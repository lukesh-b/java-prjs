/*

“Given a list of log lines, each starting with an IP address,
write a Java function that returns a map of IP → number of requests.”
 */

//=> here, I'll iterate over each line, extract the IP AND COUNT occurrences in Hashmap

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LogParser {

    public static Map<String, Integer> countIPs(List<String> logs) {
        Map<String, Integer> map = new HashMap<>();

        for (String log : logs) {
            if (log == null || log.isEmpty()) {
                continue;
            }
            String ip = log.split(" ")[0]; // first word is IP
            map.put(ip, map.getOrDefault(ip, 0) + 1);

        }
        return map;
    }

}

