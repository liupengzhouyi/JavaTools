package RandomNumberII.factory;

import RandomNumberII.model.Coordinate;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RandomFourNumberTest {

    private RandomFourNumber randomFourNumber;

    public RandomFourNumber getRandomFourNumber() {
        return randomFourNumber;
    }

    public void setRandomFourNumber(RandomFourNumber randomFourNumber) {
        this.randomFourNumber = randomFourNumber;
    }

    @BeforeEach
    void setUp() {
        this.randomFourNumber = new RandomFourNumber();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void createRandomNumber() {
        for (Coordinate coordinate : this.getRandomFourNumber().createRandomNumber()) {
            System.out.println(coordinate.toString());
        }
    }
}