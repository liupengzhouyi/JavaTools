package RandomNumberII.model;

public class MappingTable {

    // 经度
    private int Longitude ;

    // 纬度
    private int Latitude ;

    // 坐标
    private Coordinate coordinate;

    // 映射表
    private String[][] mappingTable;

    /**
     * 构造函数
     * @param mappingTable
     */
    public MappingTable(String[][] mappingTable) {
        this.mappingTable = mappingTable;
    }

    /**
     * 构造函数
     * @param coordinate
     * @param mappingTable
     */
    public MappingTable(Coordinate coordinate, String[][] mappingTable) {
        this.coordinate = coordinate;
        this.mappingTable = mappingTable;
    }

    /**
     * 无参数构造函数
     */
    public MappingTable() {
    }

    /**
     * 获取映射表中的坐标元素
     * @param longitude
     * @param latitude
     * @return
     */
    public String getItem(int longitude, int latitude) {
        return this.mappingTable[latitude][longitude];
    }

    /**
     * 获取映射表中的某一个元素
     * @return
     */
    public String getItem() {
        if (this.coordinate == null) {
            return null;
        } else {
            return this.getMappingTable()[this.getCoordinate().getLatitude()][this.getCoordinate().getLongitude()];
        }
    }

    /**
     * 获取映射表中的某一个元素
     * @param coordinate
     * @return
     */
    public String getItem(Coordinate coordinate) {
        return this.getMappingTable()[coordinate.getLatitude()][coordinate.getLongitude()];
    }

    public int getLongitude() {
        return Longitude;
    }

    public void setLongitude(int longitude) {
        Longitude = longitude;
    }

    public int getLatitude() {
        return Latitude;
    }

    public void setLatitude(int latitude) {
        Latitude = latitude;
    }

    public Coordinate getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(Coordinate coordinate) {
        this.coordinate = coordinate;
    }

    public String[][] getMappingTable() {
        return mappingTable;
    }

    public void setMappingTable(String[][] mappingTable) {
        this.mappingTable = mappingTable;
    }
}
