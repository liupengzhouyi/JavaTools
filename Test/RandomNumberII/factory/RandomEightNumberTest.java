package RandomNumberII.factory;

import RandomNumberII.model.Coordinate;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RandomEightNumberTest {

    private RandomEightNumber randomEightNumber;


    public RandomEightNumber getRandomEightNumber() {
        return randomEightNumber;
    }

    public void setRandomEightNumber(RandomEightNumber randomEightNumber) {
        this.randomEightNumber = randomEightNumber;
    }

    @BeforeEach
    void setUp() {
        this.randomEightNumber = new RandomEightNumber();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getCoordinate() {
        for (Coordinate coordinate : this.getRandomEightNumber().createRandomNumber()) {
            System.out.println(coordinate.toString());
        }
    }
}