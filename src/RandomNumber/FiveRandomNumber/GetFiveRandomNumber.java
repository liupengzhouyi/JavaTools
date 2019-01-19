package RandomNumber.FiveRandomNumber;

import RandomNumber.NumberTable;

public class GetFiveRandomNumber {

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
        this.numberTable = new NumberTable(5);
    }

    public void init() {
        this.randomNumbers = new String();
        this.createNumberTable();
    }

    public GetFiveRandomNumber() {
        this.init();
        this.setRandomNumbers(this.getNumberTable().getRandomNumber());
    }

    public static void main(String[] args) {
        GetFiveRandomNumber getFiveRandomNumber = new GetFiveRandomNumber();
        String randomNumbers = getFiveRandomNumber.getRandomNumbers();
        System.out.print(randomNumbers);
    }
}
