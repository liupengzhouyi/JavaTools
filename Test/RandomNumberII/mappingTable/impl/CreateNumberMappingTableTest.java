package RandomNumberII.mappingTable.impl;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreateNumberMappingTableTest {

    private CreateNumberMappingTable createNumberMappingTable;

    public CreateNumberMappingTable getCreateNumberMappingTable() {
        return createNumberMappingTable;
    }

    public void setCreateNumberMappingTable(CreateNumberMappingTable createNumberMappingTable) {
        this.createNumberMappingTable = createNumberMappingTable;
    }

    @BeforeEach
    void setUp() {
        this.createNumberMappingTable = new CreateNumberMappingTable();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void createMappingTable() {
        this.getCreateNumberMappingTable().getMappingTable().dispaly();
    }
}