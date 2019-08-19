package RandomNumberII.mappingTable.baseModel;

import java.util.Random;

public class NumberMappingTable {

    // 静态射映表格
    private static String[][] stringTable = new String[100][100];

    // KEY: 标志静态表格是否有元素
    private static boolean key = false;

    // 制作表格
    public void createMappingTable() {
        Random random = new Random();
        int a = 0;
        for (int i=0;i<100;i++) {
            for (int j=0;j<100;j++) {
                a = random.nextInt(10);
                String string = a + "";
                this.addItems(i, j, string);
            }
        }
        NumberMappingTable.key = true;
    }

    // 添加元素
    public void addItems(int i, int j, String item) {
        NumberMappingTable.stringTable[i][j] = item;
    }

    // 获取静态射映表格
    public String[][] getNumberMappingTable() {
        if (!NumberMappingTable.key) {
            this.createMappingTable();
        }
        return NumberMappingTable.stringTable;
    }

    // 静态获取映射表格
    public static String[][] GetNumberMappingTable() {
        if (!NumberMappingTable.key) {
            new NumberMappingTable().createMappingTable();
        }
        return NumberMappingTable.stringTable;
    }

    public void dispaly() {
        for (int i=0;i<100;i++) {
            for (int j=0;j<100;j++) {
                System.out.print(NumberMappingTable.stringTable[i][j] + "");
            }
            System.out.println("");
        }
    }

}
