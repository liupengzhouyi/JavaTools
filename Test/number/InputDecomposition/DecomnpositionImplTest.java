package number.InputDecomposition;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DecomnpositionImplTest {


    DecomnpositionImpl decomnposition = null;

    @BeforeEach
    void setUp() {
        this.decomnposition = new DecomnpositionImpl();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void decompositionNumber() {
        this.getDecomnposition().decompositionNumber(123.125);
        System.out.println(this.getDecomnposition().getDoubleInteger());
        System.out.println(this.getDecomnposition().getDoubleDecimal());
    }

    @Test
    void decompositionString() {
        this.getDecomnposition().decompositionString("1235.569");
        System.out.println(this.getDecomnposition().getStringInteger());
        System.out.println(this.getDecomnposition().getStringDecimal());
    }

    @Test
    void decompositionChineseString() {
        this.getDecomnposition().decompositionChineseString("壹拾万贰佰零叁圆零壹分");
        System.out.println(this.getDecomnposition().getStringInteger());
        System.out.println(this.getDecomnposition().getStringDecimal());
    }

    public DecomnpositionImpl getDecomnposition() {
        return decomnposition;
    }

    public void setDecomnposition(DecomnpositionImpl decomnposition) {
        this.decomnposition = decomnposition;
    }
}