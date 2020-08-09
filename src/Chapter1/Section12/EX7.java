package Chapter1.Section12;

/**
 * @Program: Algorithm
 * @ClassName: EX7
 * @Author: Mr.BitHachi
 * @CreateTime: 2020-08-09 20:03
 * @Version: V1.0
 * @Description:
 **/

public class EX7 {
    public static void main(String[] args) {
        System.out.println(mystery("ABCDEFG"));
        System.out.println(mystery("135792468"));
    }

    /*public String substring(int beginIndex,int endIndex)
    返回一个字符串，该字符串是此字符串的子字符串。
    子串开始于指定beginIndex并延伸到字符索引endIndex - 1 。
    因此，子串的长度为endIndex-beginIndex 。
    例子：
     "hamburger".substring(4, 8) returns "urge"
     "smiles".substring(1, 5) returns "mile"*/

   //将字符串逆序返回
    public static String mystery(String s) {
        int n = s.length();
        if (n <= 1) return s;
        String b = s.substring(n / 2, n);
        String a = s.substring(0, n / 2);
        return mystery(b) + mystery(a);
    }
}

