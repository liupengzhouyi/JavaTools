package 集合.数组;

public class dome01 {

    public static void main(String[] args) {

        //创建一个拥有10个空间的元素的数组。

        int numbers[] = new int[10];

        for (int i=0;i<numbers.length;i++) {
            numbers[i] = i*2;
        }

       for (int i=0;i<numbers.length;i++) {
           System.out.println(numbers[i]);
       }

    }

}
