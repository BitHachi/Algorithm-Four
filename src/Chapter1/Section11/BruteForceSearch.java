package Chapter1.Section11;

/**
 * @Program: Algorithm
 * @ClassName: BruteForceSearch
 * @Author: Mr.BitHachi
 * @CreateTime: 2020-07-16 19:41
 * @Version: V1.0
 * @Description: 暴力查找
 **/

public class BruteForceSearch {
    public static int rank(int key, int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == key) {
                return i;
            }
        }
        return -1;
    }
}

