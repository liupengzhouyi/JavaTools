package RandomNumber.FourRandomNumber;

import RandomNumber.NumberTable;

public class GetFourRandomNumber {

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
        this.numberTable = new NumberTable(4);
    }

    public void init() {
        this.randomNumbers = new String();
        this.createNumberTable();
    }

    public GetFourRandomNumber() {
        this.init();
        this.setRandomNumbers(this.getNumberTable().getRandomNumber());
    }

    public static void main(String[] args) {
        GetFourRandomNumber getFourRandomNumber = new GetFourRandomNumber();
        String randomNumbers = getFourRandomNumber.getRandomNumbers();
        System.out.print(randomNumbers);
    }
}
