package RandomNumberII.factory;

public class RandomNumberFactory {

    private int number;

    private GetRandomNumber getRandomNumber;

    public RandomNumberFactory(int number) {
        this.setNumber(number);
        this.factory();
    }

    public void factory() {
        switch (this.getNumber()) {
            case 4 : {
                this.setGetRandomNumber(new RandomFourNumber());
                break;
            }
            case 6 : {
                this.setGetRandomNumber(new RandomSixNumber());
                break;
            }
            case 8 : {
                this.setGetRandomNumber(new RandomEightNumber());
                break;
            }
        }
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public GetRandomNumber getGetRandomNumber() {
        return getRandomNumber;
    }

    public void setGetRandomNumber(GetRandomNumber getRandomNumber) {
        this.getRandomNumber = getRandomNumber;
    }
}
