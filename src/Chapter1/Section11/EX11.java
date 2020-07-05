package Chapter1.Section11;

/**
 * @Program: Algorithm
 * @ClassName: EX1_1_11
 * @Author: Mr.BitHachi-1.txt
 * @CreateTime: 2020-06-14 23:20
 * @Version: V1.0
 * @Description: 练习题1.1.11
 **/

public class EX11 {
    public static void main(String[] args) {
        /************  1.1.11  ************/
        boolean[][] b = new boolean[3][3];
        for (int i = 0; i < b.length; i++)
            for (int j = 0; j < b[0].length; j++) {
                if ((i + j) % 2 == 1)
                    b[i][j] = true;
                else b[i][j] = false;
            }
        int h=1;
        for (boolean[] i : b) {
            System.out.print("第"+h+"行:");
            for (boolean j : i)
                System.out.print(j + "-");
            System.out.println();
            h++;
        }
        /************  这里以1代表 *，以0代表" "  ************/
        h=1;
        for (boolean[] i : b) {
            System.out.print("第"+h+"行:");
            for (boolean j : i){
                if(j==true) System.out.print("1"+"-");
                else System.out.print("0"+"-");
            }
            System.out.println();
            h++;
        }
    }
}

