package RandomNumberII.mappingTable;

import java.util.Random;

public class CharMappingTable {

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
                a = random.nextInt(26);
                String string = (char) ((int) ('a' + a)) + "";
                this.addItems(i, j, string);
            }
        }
    }

    // 添加元素
    public void addItems(int i, int j, String item) {
        CharMappingTable.stringTable[i][j] = item;
    }

    // 获取静态射映表格
    public String[][] getCharMappingTable() {
        if (!CharMappingTable.key) {
            this.createMappingTable();
        }
        return CharMappingTable.stringTable;
    }

    // 静态获取映射表格
    public static String[][] GetCharMappingTable() {
        if (!CharMappingTable.key) {
            new CharMappingTable().createMappingTable();
        }
        return CharMappingTable.stringTable;
    }

    public void dispaly() {
        for (int i=0;i<100;i++) {
            for (int j=0;j<100;j++) {
                System.out.print(CharMappingTable.stringTable[i][j] + "");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        CharMappingTable charMappingTable = new CharMappingTable();
        //charMappingTable.getCharMappingTable();
        CharMappingTable.GetCharMappingTable();
        charMappingTable.dispaly();
    }

}
