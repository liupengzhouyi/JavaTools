package RandomNumberII.mappingTable.impl;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreateNumberAndCharMappingTableTest {

    private CreateNumberAndCharMappingTable createNumberAndCharMappingTable;

    @BeforeEach
    void setUp() {
        this.createNumberAndCharMappingTable = new CreateNumberAndCharMappingTable();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void createMappingTable() {
        this.getCreateNumberAndCharMappingTable().getMappingTable().dispaly();
    }

    public CreateNumberAndCharMappingTable getCreateNumberAndCharMappingTable() {
        return createNumberAndCharMappingTable;
    }

    public void setCreateNumberAndCharMappingTable(CreateNumberAndCharMappingTable createNumberAndCharMappingTable) {
        this.createNumberAndCharMappingTable = createNumberAndCharMappingTable;
    }
}