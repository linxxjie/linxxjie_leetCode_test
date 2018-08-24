package linxxjie_string;

public class LinxxjieTest07 {
    public String addBinary(String a, String b) {
        StringBuilder builder = new StringBuilder();
        //起始位置
        int starta = a.length() - 1;
        int startb = b.length() - 1;
        //最大长度
        int max;
        if (starta > startb) {
            max = starta + 1;
        } else {
            max = startb + 1;
        }
        //每位计算之后的结果
        int sum;
        //进位标志
        int temp = 0;
        for (int i = 0; i < max; i++) {
            //如果a到达最大长度
            if (starta - i < 0) {
                sum = Integer.parseInt(String.valueOf(b.charAt(startb - i))) + temp;
            } else if (startb - i < 0) {
                //b到达最大长度
                sum = Integer.parseInt(String.valueOf(a.charAt(starta - i))) + temp;
            } else {
                sum = Integer.parseInt(String.valueOf(b.charAt(startb - i))) + Integer.parseInt(String.valueOf(a.charAt(starta - i))) + temp;
            }
            temp = 0;
            //如果和大于1 进位
            if (sum > 1) {
                sum -= 2;
                temp++;
            }
            builder.append(sum);
            //如果在最高位需要进位
            if (i == max - 1 && temp != 0) {
                builder.append(1);
            }
        }
        return builder.reverse().toString();
    }
}
