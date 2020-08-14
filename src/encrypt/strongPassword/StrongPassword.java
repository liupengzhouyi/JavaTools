package encrypt.strongPassword;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @文件名 encrypt.strongPassword
 * @描述
 * @创建人 liupeng
 * @作者联系方式 LIUPENG.0@outlook.com
 * @创建时间 2020/8/5 - 8:00 下午
 * @修改人和其它信息
 */
public class StrongPassword {

    public boolean strongPasswordChecker(String s) {
        int len = s.length();
        if (len == 0) return false;
        char[] ss = s.toCharArray();

        // 记录所需小写字母、大写字母和数字的个数
        // cnt记录重复序列的字符计数
        int low = 1, up = 1, num = 1, cnt = 1;
        if (Character.isLowerCase(ss[0])) low = 0;
        else if (Character.isUpperCase(ss[0])) up = 0;
        else if (Character.isDigit(ss[0])) num = 0;

        // 优先队列，x%3小的先出队，为方便需要删除操作时先处理段的序列
        Queue<Integer> queue = new PriorityQueue<>((a, b) -> a % 3 - b % 3);

        for (int i = 1; i < len; i ++) {
            if (low == 1 && Character.isLowerCase(ss[i])) low = 0;
            else if (up == 1 && Character.isUpperCase(ss[i])) up = 0;
            else if (num == 1 && Character.isDigit(ss[i])) num = 0;

            // 对连续相同的序列计数，并存入优先队列
            if (ss[i] != ss[i - 1]) {
                if (cnt >= 3) queue.add(cnt);
                cnt = 1;
            } else {
                cnt ++;
            }
        }
        if (cnt >= 3) queue.add(cnt);

        int ans = 0, all = low + up + num;

        // 长度不足，则根据是否有重复序列进行替换、加添操作
        if (len < 6) return false;

        // 删除操作，从最短的连续序列开始处理
        while (!queue.isEmpty() && len > 20) {
            int cur = queue.remove();
            ans ++;
            len --;
            if (-- cur >= 3) queue.add(cur);
        }

        // 解决完重复序列后，字符串仍然过长
        if (len > 20) return false;

        // 未处理完重复序列就已经达到长度要求，继续处理重复序列
        // 此时就只考虑替换操作就好了
        int n = 0;
        while (!queue.isEmpty()) {
            n += queue.remove() / 3;
        }
        int key = ans + Math.max(n, all);
        return key == 0;
    }

    public static void main(String[] args) {
        StrongPassword strongPassword = new StrongPassword();
        String password = "Lp127";
        System.out.println(strongPassword.strongPasswordChecker(password));
    }

}
