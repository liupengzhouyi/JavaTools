package RandomNumber;

import java.util.Random;

public class NumberTable {

    private String randomNumber = null;

    private int number = 0;

    private int[][] numbers;

    private int[] countNumbers;

    public String getRandomNumber() {
        return randomNumber;
    }

    public void setRandomNumber(int randomNumber) {
        this.randomNumber = this.randomNumber + randomNumber;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int[][] getNumbers() {
        return numbers;
    }

    public void setNumbers(int[][] numbers) {
        this.numbers = numbers;
    }

    public int[] getCountNumbers() {
        return countNumbers;
    }

    public void setCountNumbers(int[] countNumbers) {
        this.countNumbers = countNumbers;
    }

    public void createNumbers() {
        Random random = new Random();
        int a = 0;
        for (int i=0;i<10;i++) {
            for (int j=0;j<6;j++) {
                a = random.nextInt(10);
                this.addNumber(j, i, a);
                //System.out.print(a + " ");
            }
            //System.out.println();
        }
    }

    public void addNumber(int i, int j, int number) {
        this.getNumbers()[i][j] = number;
    }

    public int getRandNumber(int i, int j) {
        int value = this.getNumbers()[i][j];
        return value;
    }

    public void init() {
        this.numbers = new int[6][10];
        this.countNumbers = new int[10];
        for (int i=0;i<10;i++) {
            this.countNumbers[i] = 0;
        }
        this.randomNumber = new String();
    }

    public void addCountNumber(int count) {
        int tempCount = this.countNumbers[count];
        tempCount = tempCount + 1;
        this.countNumbers[count] = tempCount;
    }

    public void createRandomNumbers() {
        int numbers = this.getNumber();
        Random random = new Random();
        int tempRandom = 0;
        int randomCount = 0;
        for (int i=0; i<numbers; i++) {
            randomCount = random.nextInt(10);
            //获取计数个数
            int count = this.getCountNumbers()[randomCount];
            //获取随机数表中的数据
            //System.out.println(randomCount + " : " + count);
            tempRandom = this.getRandNumber(count, randomCount);
            //System.out.println( + tempRandom);
            this.setRandomNumber(tempRandom);
            //计数加一
            this.addCountNumber(randomCount);
        }
    }

    public NumberTable(int number) {
        this.init();
        this.setNumber(number);
        this.createNumbers();
        this.createRandomNumbers();
    }

    public void showRandomNumberTable() {
        for (int i=0;i<6;i++) {
            for (int j=0;j<10;j++) {
                System.out.print(this.getNumbers()[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        NumberTable numberTable = new NumberTable(6);
        //numberTable.showRandomNumberTable();
        String string = numberTable.getRandomNumber();
        System.out.println(string);
    }


}
