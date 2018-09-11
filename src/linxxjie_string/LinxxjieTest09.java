package linxxjie_string;

public class LinxxjieTest09 {
    public String longestCommonPrefix(String[] strs) {
        String prestr = "";
        if (strs.length > 1) {
            String flagstr = strs[0];
            for (int i = 0; i < flagstr.length(); i++) {
                for (int j = 1; j < strs.length; j++) {
                    int temp = strs[j].indexOf(flagstr.substring(0, i + 1));
                    if (temp == -1 || temp != 0) {
                        if (i > 0) {
                            prestr = flagstr.substring(0, i);
                            return prestr;
                        } else {
                            return prestr;
                        }

                    }
                }
            }
            prestr = flagstr;
        } else if (strs.length == 1) {
            prestr = strs[0];
        }
        return prestr;
    }
}
