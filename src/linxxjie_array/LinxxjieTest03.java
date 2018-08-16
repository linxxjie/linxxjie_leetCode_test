package linxxjie_array;

public class LinxxjieTest03 {
    public int[] plusOne(int[] digits) {
        int temp = 0;
        int[] arr;
        for (int i = digits.length - 1; i > -1; i--) {
            if (temp == 1) {
                temp = 0;
            }
            digits[i] = digits[i] + 1;
            if (digits[i] > 9) {
                temp = 1;
                digits[i] = digits[i] - 10;
                if(i == 0){
                    arr = new int[digits.length + 1];
                    arr[0] = 1;
                    for (int j = 1; j < digits.length+1; j++) {
                        arr[j] = digits[j-1];
                    }
                    return arr;
                }
            } else {
                arr = digits;
                return arr;
            }
        }
        return digits;
    }
}
