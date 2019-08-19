package RandomNumberII;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreateRandomNumberTest {

    private CreateRandomNumber createRandomNumber;

    public CreateRandomNumber getCreateRandomNumber() {
        return createRandomNumber;
    }

    public void setCreateRandomNumber(CreateRandomNumber createRandomNumber) {
        this.createRandomNumber = createRandomNumber;
    }

    @BeforeEach
    void setUp() {
        this.createRandomNumber = new CreateRandomNumber(1, 6);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void create() {
        String randomNumbers = this.getCreateRandomNumber().getRandomNumbers();
        System.out.println(randomNumbers);
    }
}