package number.MyConversion;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyConversionImplTest {


    private MyConversionImpl myConversion = null;

    @BeforeEach
    void setUp() {
        this.myConversion = new MyConversionImpl();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void integerToCapitalNumber() {
        this.getMyConversion().IntegerToCapitalNumber(112358231235.0);
        System.out.println(this.getMyConversion().getMoney());
    }

    @Test
    void decimalToCapitalNumber() {
    }

    @Test
    void testIntegerToCapitalNumber() {
    }

    @Test
    void testDecimalToCapitalNumber() {
    }

    @Test
    void chineseCharactersToCapitalNumber() {
    }

    public MyConversionImpl getMyConversion() {
        return myConversion;
    }

    public void setMyConversion(MyConversionImpl myConversion) {
        this.myConversion = myConversion;
    }
}