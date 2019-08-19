package RandomNumberII;

import RandomNumberII.factory.GetRandomNumber;

public class Main {
    public static void main(String[] args) {

        CreateRandomNumber createRandomNumber;

        createRandomNumber = new CreateRandomNumber(2, 8);

        System.out.println(createRandomNumber.getRandomNumbers());


    }
}
