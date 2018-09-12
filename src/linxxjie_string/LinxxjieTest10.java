package linxxjie_string;

public class LinxxjieTest10 {
    public String reverseString(String s) {
        if (s == "") {
            return "";
        }
        String result;
        int len = s.length();
        int i = 0;
        int j = len - 1;
        char[] str = s.toCharArray();
        while (i < j) {
            char temp = str[i];
            str[i] = str[j];
            str[j] = temp;
            i++;
            j--;
        }
        result = new String(str);
        return result;
    }
}
