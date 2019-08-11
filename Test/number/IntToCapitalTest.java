package number;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntToCapitalTest {

    private IntToCapital intToCapital;

    IntToCapital getIntToCapital() {
        return intToCapital;
    }

    public void setIntToCapital(IntToCapital intToCapital) {
        this.intToCapital = intToCapital;
    }

    @BeforeEach
    void setUp() {
        this.intToCapital = new IntToCapital();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getSwichCapital() {
        String number = this.getIntToCapital().capitalNumber("123");
        System.out.println(number);
    }
}