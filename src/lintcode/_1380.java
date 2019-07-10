package lintcode;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _1380 {

    static class Log implements Comparable<Log> {
        String id;
        String content;

        public Log(String id, String content) {
            this.id = id;
            this.content = content;
        }

        @Override
        public String toString() {
            return "Log{" +
                    "id='" + id + '\'' +
                    ", content='" + content + '\'' +
                    '}';
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        @Override
        public int compareTo(Log o) {

            //是否包含数字，包含数字的往后排
            Pattern pattern = Pattern.compile("[0-9]*");
            Matcher isNum1 = pattern.matcher(content);
            Matcher isNum2 = pattern.matcher(o.content);
            if (!isNum1.matches() && !isNum2.matches()) {
                //不包含数字，先排序日志内容，如果内容相同，排序id
                int i = content.compareTo(o.content);
                if (i != 0) {
                    return i;
                }
                i = id.compareTo(o.id);
                return i;
            }
            return 0;
        }
    }

    public static String[] logSort(String[] logs) {

        if (logs.length < 2) {
            return logs;
        }
        int length = logs.length;
        Log[] arr = new Log[length];
        String tmp = "";
        for (int i = 0; i < length - 1; i++) {
            int pos = logs[i].indexOf(" ");
            int pos1 = logs[i + 1].indexOf(" ");
            String str1 = logs[i].substring(0, pos);
            String str2 = logs[i].substring(pos + 1);
            String str3 = logs[i + 1].substring(0, pos1);
            String str4 = logs[i + 1].substring(pos1 + 1);
            Pattern pattern = Pattern.compile("[0-9]*");
            Matcher isNum1 = pattern.matcher(str2);
            Matcher isNum2 = pattern.matcher(str4);
            if (!isNum1.matches() && !isNum2.matches()) {
                if (str2.compareTo(str4) < 0) {
                    tmp = logs[i];
                    logs[i] = logs[i + 1];
                    logs[i + 1] = tmp;
                }
            } else if (!isNum1.matches() && isNum2.matches()) {
                tmp = logs[i];
                logs[i] = logs[i + 1];
                logs[i + 1] = tmp;
            }
        }
        for (int i = 0; i < logs.length; i++) {
            System.out.println(logs[i]);
        }
        return logs;
    }

    public static void main(String[] args) {

        String[] logs = {"zo4 4 7",
                "a100 Act zoo",
                "a1 9 2 3 1",
                "g9 act car"};
        String[] strings = logSort(logs);
//        System.out.println(Arrays.toString(strings));

//        System.out.println("zo4 4 7".indexOf(" "));
    }
}
