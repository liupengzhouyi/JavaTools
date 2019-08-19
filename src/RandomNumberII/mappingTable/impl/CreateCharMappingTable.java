package RandomNumberII.mappingTable.impl;

import RandomNumberII.mappingTable.baseModel.CharMappingTable;
import RandomNumberII.mappingTable.baseModel.NumberAndCharMappingTable;
import RandomNumberII.mappingTable.mappintInterface.CreateMappingTable;
import RandomNumberII.model.MappingTable;

public class CreateCharMappingTable implements CreateMappingTable {

    private MappingTable mappingTable;


    public CreateCharMappingTable() {
        this.CreateMappingTable();
    }

    /**
     * create Mapping Table
     */
    @Override
    public void CreateMappingTable() {
        this.setMappingTable(new MappingTable(CharMappingTable.GetCharMappingTable()));
    }


    public MappingTable getMappingTable() {
        return mappingTable;
    }

    public void setMappingTable(MappingTable mappingTable) {
        this.mappingTable = mappingTable;
    }
}
