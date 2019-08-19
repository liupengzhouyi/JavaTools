package RandomNumberII.mappingTable;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberAndCharMappingTableTest {


    private NumberAndCharMappingTable numberAndCharMappingTable;


    @BeforeEach
    void setUp() {
        this.numberAndCharMappingTable = new NumberAndCharMappingTable();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getNumberMappingTableI() {
        String[][] strings = this.numberAndCharMappingTable.getNumberMappingTable();
        for (int i=0;i<100;i++) {
            for (int j=0;j<100;j++) {
                System.out.print(strings[i][j] + "");
            }
            System.out.println("");
        }
    }

    @Test
    void getNumberMappingTableII() {
        String[][] strings = NumberAndCharMappingTable.GetNumberMappingTable();
        for (int i=0;i<100;i++) {
            for (int j=0;j<100;j++) {
                System.out.print(strings[i][j] + "");
            }
            System.out.println("");
        }
    }
}