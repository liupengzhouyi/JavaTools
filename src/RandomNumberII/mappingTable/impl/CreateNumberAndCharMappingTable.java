package RandomNumberII.mappingTable.impl;

import RandomNumberII.mappingTable.baseModel.NumberAndCharMappingTable;
import RandomNumberII.mappingTable.mappintInterface.CreateMappingTable;
import RandomNumberII.model.MappingTable;

public class CreateNumberAndCharMappingTable implements CreateMappingTable {

    private MappingTable mappingTable;


    public CreateNumberAndCharMappingTable() {
        this.CreateMappingTable();
    }

    /**
     * create Mapping Table
     */
    @Override
    public void CreateMappingTable() {
        this.setMappingTable(new MappingTable(NumberAndCharMappingTable.GetNumberAndCharMappingTable()));
    }


    public MappingTable getMappingTable() {
        return mappingTable;
    }

    public void setMappingTable(MappingTable mappingTable) {
        this.mappingTable = mappingTable;
    }
}
