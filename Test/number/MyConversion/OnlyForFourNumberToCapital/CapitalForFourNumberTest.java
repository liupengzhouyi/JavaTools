package number.MyConversion.OnlyForFourNumberToCapital;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CapitalForFourNumberTest {

    private CapitalForFourNumber capitalForFourNumber = null;

    @BeforeEach
    void setUp() {
        this.capitalForFourNumber = new CapitalForFourNumber("0000");
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getNumber() {
        System.out.println(this.getCapitalForFourNumber().getNumber());
    }

    public CapitalForFourNumber getCapitalForFourNumber() {
        return capitalForFourNumber;
    }

    public void setCapitalForFourNumber(CapitalForFourNumber capitalForFourNumber) {
        this.capitalForFourNumber = capitalForFourNumber;
    }
}