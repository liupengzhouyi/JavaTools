package RandomNumberII.mappingTable.impl;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreateCharMappingTableTest {

    private CreateCharMappingTable createCharMappingTable;

    public CreateCharMappingTable getCreateCharMappingTable() {
        return createCharMappingTable;
    }

    public void setCreateCharMappingTable(CreateCharMappingTable createCharMappingTable) {
        this.createCharMappingTable = createCharMappingTable;
    }

    @BeforeEach
    void setUp() {
        this.createCharMappingTable = new CreateCharMappingTable();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void createMappingTable() {
        this.getCreateCharMappingTable().getMappingTable().dispaly();
    }
}