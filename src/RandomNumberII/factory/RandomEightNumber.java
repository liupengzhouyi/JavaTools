package RandomNumberII.factory;

import RandomNumberII.model.Coordinate;

import java.util.Random;

public class RandomEightNumber implements GetRandomNumber{

    private Coordinate[] coordinates;

    /**
     * 生成一组随机坐标
     * 一组表示：数据行
     * 一组表示：数据列
     * @return
     */
    @Override
    public Coordinate[] createRandomNumber() {
        int Longitude, Latitude;
        this.coordinates = new Coordinate[8];
        Random random = new Random();
        for (int i=0;i<8;i++) {
            int a = random.nextInt(100);
            String strA = a + "";
            Longitude = strA.hashCode() % 100;
            a = random.nextInt(100);
            strA = a + "";
            Latitude = strA.hashCode() % 99;
            Coordinate coordinate = new Coordinate(Longitude, Latitude);
            this.addCoordinate(i, coordinate);
        }
        return this.coordinates;
    }

    /**
     * @param kind 表示要获取的数据数类型 ：
     * @param number 表示要生成
     * @return
     */
    @Override
    public String getRandomNumber(int kind, int number) {
        return null;
    }


    /**
     * 添加坐标
     * @param index
     * @param coordinate
     */
    public void addCoordinate(int index, Coordinate coordinate) {
        this.coordinates[index] = coordinate;
    }
}
