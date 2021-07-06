package Chapter1.Section12;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * @Program: Algorithm
 * @ClassName: EX12
 * @Author: Mr.BitHachi
 * @CreateTime: 2020-08-13 21:46
 * @Version: V1.0
 * @Description:
 * 泰勒公式：https://baike.baidu.com/item/%E8%94%A1%E5%8B%92%E5%85%AC%E5%BC%8F/10491767?fr=aladdin
 **/

public class EX12 {
    public static void main(String[] args) {
        System.out.println(new SmartDate(8, 13, 2020).dayOfTheWeek());
        System.out.println(new SmartDate(8, 16, 2020).dayOfTheWeek());
        System.out.println(new SmartDate(8, 17, 2020).dayOfTheWeek());
        System.out.println(new SmartDate(2, 28, 2010).dayOfTheWeek());
        System.out.println(new SmartDate(6, 4, 2030).dayOfTheWeek());
    }


    static class SmartDate {
        private final int month;
        private final int day;
        private final int year;

        //蔡勒公式法
        public String dayOfTheWeek() {
            String[] week = {"星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六"};
            int y = year;
            int m = month;
            int d = day;
            //当年的1,2月要当成上一年的13,14月进行计算
            if (month == 1 || month == 2) {
                m += 12;
                y--;
            }
            int c = y / 100; // 世纪
            y = y % 100;   //获取年份后两位 比如：1998%100=98
            int w = (y + (y / 4) + (c / 4) - (2 * c) + ((26 * (m + 1)) / 10) + d - 1) % 7;
            w = (w + 7) % 7;
            return year + "/" + month + "/" + day +": " +  week[w];
        }

        public SmartDate(int m, int d, int y) {
            /************  方法一  ************/
            String str = y + "/" + m + "/" + d;

            if (!isValidDate(str)) {
                throw new IllegalArgumentException(m + "/" + d + "/" + y + "不合法");
            }
            this.month = m;
            this.day = d;
            this.year = y;

            /************  方法二  ************/
//        if (!validate(m, d, y))
//            throw new IllegalArgumentException("Argument illegal " + m + "/" + d + "/" + y);
//        this.month = m;
//        this.day = d;
//        this.year = y;
        }

        /************  方法一  ************/
        public  boolean isValidDate(String str) {
            boolean convertSuccess = true;
            // 指定日期格式为四位年/两位月份/两位日期，注意yyyy/MM/dd区分大小写；
            SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
            try {
                // 设置lenient为false. 否则SimpleDateFormat会比较宽松地验证日期，比如2007/02/29会被接受，并转换成2007/03/01
                format.setLenient(false);
                format.parse(str);
            } catch (ParseException e) {
                // e.printStackTrace();
                // 如果throw java.text.ParseException或者NullPointerException，就说明格式不对
                convertSuccess = false;
            }
            return convertSuccess;
        }

        public int month() {
            return month;
        }

        public int day() {
            return day;
        }

        public int year() {
            return year;
        }

        public String toString() {
            return month + "/" + day + "/" + year;
        }

        /************  方法二  ************/
        private boolean validate(int m, int d, int y) {
            if (y == 0 || y < -1000 || y > 10000)
                return false;
            if (m < 1 || m > 12)
                return false;
            if (d < 1 || d > 31)
                return false;
            int[] months = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            if (d > months[m])
                return false;
            if (!(y % 400 == 0 || (y % 4 == 0 && y % 100 != 0))) {
                return d <= 28;
            }
            return true;
        }
    }
}

