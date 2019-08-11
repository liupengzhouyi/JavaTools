package number;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SwichCapitalTest {

    private SwichCapital swichCapital;

    SwichCapital getSwichCapital() {
        return swichCapital;
    }

    public void setSwichCapital(SwichCapital swichCapital) {
        this.swichCapital = swichCapital;
    }

    @BeforeEach
    void setUp() {
        swichCapital = new SwichCapital();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void capital() {

    }
}