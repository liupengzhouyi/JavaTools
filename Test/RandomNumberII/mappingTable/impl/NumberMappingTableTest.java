package RandomNumberII.mappingTable.impl;

import RandomNumberII.mappingTable.baseModel.NumberMappingTable;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class NumberMappingTableTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getNumberMappingTable() {
        NumberMappingTable numberMappingTable = new NumberMappingTable();
        numberMappingTable.createMappingTable();
        numberMappingTable.dispaly();
    }

    @Test
    void GetNumberMappingTable() {
        NumberMappingTable numberMappingTable = new NumberMappingTable();
        NumberMappingTable.GetNumberMappingTable();
        numberMappingTable.dispaly();
    }
}