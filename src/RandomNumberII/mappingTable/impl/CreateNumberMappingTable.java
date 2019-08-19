package RandomNumberII.mappingTable.impl;

import RandomNumberII.mappingTable.baseModel.NumberAndCharMappingTable;
import RandomNumberII.mappingTable.baseModel.NumberMappingTable;
import RandomNumberII.mappingTable.mappintInterface.CreateMappingTable;
import RandomNumberII.model.MappingTable;

public class CreateNumberMappingTable implements CreateMappingTable {

    private MappingTable mappingTable;


    public CreateNumberMappingTable() {
        this.CreateMappingTable();
    }

    /**
     * create Mapping Table
     */
    @Override
    public void CreateMappingTable() {
        this.setMappingTable(new MappingTable(NumberMappingTable.GetNumberMappingTable()));
    }


    public MappingTable getMappingTable() {
        return mappingTable;
    }

    public void setMappingTable(MappingTable mappingTable) {
        this.mappingTable = mappingTable;
    }
}
