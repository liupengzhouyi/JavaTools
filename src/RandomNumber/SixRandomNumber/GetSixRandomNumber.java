package RandomNumber.SixRandomNumber;

import RandomNumber.NumberTable;

public class GetSixRandomNumber {

    private String randomNumbers = null;

    private NumberTable numberTable = null;

    public String getRandomNumbers() {
        return randomNumbers;
    }

    public void setRandomNumbers(String randomNumbers) {
        this.randomNumbers = randomNumbers;
    }

    public NumberTable getNumberTable() {
        return numberTable;
    }

    public void setNumberTable(NumberTable numberTable) {
        this.numberTable = numberTable;
    }

    public void createNumberTable() {
        this.numberTable = new NumberTable(6);
    }

    public void init() {
        this.randomNumbers = new String();
        this.createNumberTable();
    }

    public GetSixRandomNumber() {
        this.init();
        this.setRandomNumbers(this.getNumberTable().getRandomNumber());
    }

    public static void main(String[] args) {
        GetSixRandomNumber GetSixRandomNumber = new GetSixRandomNumber();
        String randomNumbers = GetSixRandomNumber.getRandomNumbers();
        System.out.print(randomNumbers);
    }
}
