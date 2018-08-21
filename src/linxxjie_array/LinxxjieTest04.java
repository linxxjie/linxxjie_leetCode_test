package linxxjie_array;

public class LinxxjieTest04 {
    public int[] findDiagonalOrder(int[][] matrix) {
        //空判断
        if (matrix.length == 0) {
            return new int[0];
        }
        //行、列
        int line = matrix.length;
        int col = matrix[0].length;
        //是否超过中心组
        boolean flag = false;
        //返回的数组
        int[] arr = new int[line * col];
        //每组已找到的元素个数
        int len = 0;
        //元素索引和
        int i = 0;
        //每个对角线上的元素个数
        int temlen = 0;
        //通过的中心组数
        int center = 0;
        //返回的数组长度
        int length = 0;
        //取行和列中最小的
        int min;
        if (line >= col) {
            min = col;
        } else {
            min = line;
        }
        //方向
        boolean direction = false;
        while (i < line + col) {
            //计算每组中有多少元素
            if (temlen < min && flag == false) {
                temlen++;
            } else {
                if (line == col) {
                    temlen--;
                    flag = true;
                } else {
                    if (center < line + col - 1 - (min - 1) * 2 - 1) {
                        center++;
                    } else {
                        temlen--;
                        flag = true;
                    }
                }
            }
            //上行
            if (direction == false) {
                for (int j = matrix.length - 1; j > -1; j--) {
                    for (int k = 0; k < matrix[0].length; k++) {
                        if(j + k == i){
                            arr[length++] = matrix[j][k];
                            len++;
                        }
                        if (len == temlen) {
                            len = 0;
                            break;
                        }
                    }
                }
            } else {
                //下行
                for (int j = 0; j < matrix.length; j++) {
                    for (int k = 0; k < matrix[0].length; k++) {
                        if (j + k == i){
                            arr[length++] = matrix[j][k];
                            len++;
                        }
                    }
                    if (len == temlen) {
                        len = 0;
                        break;
                    }
                }
            }
            i++;
            direction = !direction;
        }
        return arr;
    }
}
