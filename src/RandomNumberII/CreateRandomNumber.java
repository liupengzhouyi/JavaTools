package RandomNumberII;

import RandomNumberII.factory.GetRandomNumber;
import RandomNumberII.factory.RandomNumberFactory;
import RandomNumberII.mappingTable.factory.MappingFactory;
import RandomNumberII.model.Coordinate;
import RandomNumberII.model.MappingTable;

public class CreateRandomNumber {

    private Coordinate[] coordinates;

    private MappingTable mappingTable;

    private String randomNumbers;

    public CreateRandomNumber(int kind, int numbers) {
        this.setKind(kind);
        this.setNumbers(numbers);
        this.setRandomNumbers("");
        this.create();
    }

    /**
     * 1 : char
     * 2 : number and char
     * 3 : number
     */
    private int kind;

    private int numbers;

    public void create() {
        // System.out.println("创建随机数");
        // 创建随机数
        this.setCoordinates(new RandomNumberFactory(this.getNumbers()).getGetRandomNumber().createRandomNumber());
        // System.out.println("创建随机数表");
        // 创建随机数表
        this.setMappingTable(new MappingFactory(this.getKind()).getMappingTable());
        for (Coordinate coordinate : this.getCoordinates()) {
            // System.out.println(coordinate.toString());
            String item = this.getMappingTable().getItem(coordinate);
            // System.out.println(item);
            this.addNumber(item);
        }
    }

    // 随机数中增加元素
    public void addNumber(String item) {
        this.setRandomNumbers(this.getRandomNumbers() + item);
    }

    public int getKind() {
        return kind;
    }

    public void setKind(int kind) {
        this.kind = kind;
    }

    public int getNumbers() {
        return numbers;
    }

    public void setNumbers(int numbers) {
        this.numbers = numbers;
    }

    public Coordinate[] getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Coordinate[] coordinates) {
        this.coordinates = coordinates;
    }

    public MappingTable getMappingTable() {
        return mappingTable;
    }

    public void setMappingTable(MappingTable mappingTable) {
        this.mappingTable = mappingTable;
    }

    public String getRandomNumbers() {
        return randomNumbers;
    }

    public void setRandomNumbers(String randomNumbers) {
        this.randomNumbers = randomNumbers;
    }
}
