package number.Conversion;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConversionImplTest {

    private ConversionImpl conversion = null;

    public ConversionImpl getConversion() {
        return conversion;
    }

    public void setConversion(ConversionImpl conversion) {
        this.conversion = conversion;
    }

    @BeforeEach
    void setUp() {
        this.conversion = new ConversionImpl();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void conversionNumber() {
        this.getConversion().conversionNumber(1);
        System.out.println(this.getConversion().getCapitalNumber());
    }

    @Test
    void conversionString() {
        this.getConversion().conversionString("2");
        System.out.println(this.getConversion().getCapitalNumber());
    }

    @Test
    void conversionChineseString() {
        this.getConversion().conversionChineseString("三");
        System.out.println(this.getConversion().getCapitalNumber());
    }
}