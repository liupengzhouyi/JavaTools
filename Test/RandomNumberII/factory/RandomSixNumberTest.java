package RandomNumberII.factory;

import RandomNumberII.model.Coordinate;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RandomSixNumberTest {

    private RandomSixNumber randomSixNumber;

    public RandomSixNumber getRandomSixNumber() {
        return randomSixNumber;
    }

    public void setRandomSixNumber(RandomSixNumber randomSixNumber) {
        this.randomSixNumber = randomSixNumber;
    }

    @BeforeEach
    void setUp() {
        this.randomSixNumber = new RandomSixNumber();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void createRandomNumber() {
        for (Coordinate coordinate : this.getRandomSixNumber().createRandomNumber()) {
            System.out.println(coordinate.toString());
        }
    }
}