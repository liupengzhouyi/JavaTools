package RandomNumberII.mappingTable.impl;

import RandomNumberII.mappingTable.baseModel.CharMappingTable;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CharMappingTableTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getCharMappingTable() {
        CharMappingTable charMappingTable = new CharMappingTable();
        charMappingTable.getCharMappingTable();
        charMappingTable.dispaly();
    }

    @Test
    void GetCharMappingTable() {
        CharMappingTable charMappingTable = new CharMappingTable();
        CharMappingTable.GetCharMappingTable();
        charMappingTable.dispaly();
    }
}