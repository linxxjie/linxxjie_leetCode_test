package linxxjie_array;

import java.util.ArrayList;
import java.util.List;

public class LinxxjieTest05 {
    public List<Integer> spiralOrder(int[][] matrix) {
        if(matrix.length == 0){
            return new ArrayList<Integer>();
        }
        List<Integer> result = new ArrayList<Integer>();
        //行、列
        int line = matrix.length;
        int col = matrix[0].length;
        //起始
        int right = 0;
        int down = 1;
        int up = line - 2;
        int left = col-2;
        //起始总元素个数
        int right_start = col;
        int down_start = line-1;
        int left_start = col - 1;
        int up_start = line - 2;
        //行、列中小的
        int min;
        //循环总次数
        int circle;
        //循环
        int num = 0;
        if(line < col){
            min = line;
        }else {
            min = col;
        }
        //循环次数：
        if(min % 2 != 0){
            circle = min / 2 + 1;
        }else{
            circle = min / 2;
        }
        while (num < circle){
            //行右
            for (int i = 0; i < right_start ; i++) {
                    result.add(matrix[right][i + right]);
            }
            if(right_start == 0){
                break;
            }else {
                right_start -= 2;
                right += 1;
            }

            //列下
            for (int i = 0; i < down_start ; i++) {
                result.add(matrix[down + i][col-num-1]);
            }
            if(down_start == 0){
                break;
            }else {
                down += 1;
                down_start -= 2;
            }

            //行左
            for (int i = 0; i < left_start ; i++) {
                result.add(matrix[line-1 - num][left-i]);
            }
            if(left_start == 0){
                break;
            }else {
                left -= 1;
                left_start -= 2;
            }
            //列上
            for (int i = 0; i < up_start ; i++) {
                result.add(matrix[up - i][num]);
            }
            if(up_start == 0){
                break;
            }else {
                up -= 1;
                up_start -= 2;
            }
            num ++;
        }
        return result;
    }
}
