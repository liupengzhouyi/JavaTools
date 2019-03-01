package Password;

public class NewDateTpye {

    private int 种类序号;

    private int 数字序号;

    @Override
    public String toString() {
        return this.get种类序号() + "" + this.get数字序号() + "";
    }

    public int get种类序号() {
        return 种类序号;
    }

    public void set种类序号(int 种类序号) {
        this.种类序号 = 种类序号;
    }

    public int get数字序号() {
        return 数字序号;
    }

    public void set数字序号(int 数字序号) {
        this.数字序号 = 数字序号;
    }

    public NewDateTpye(int 种类序号, int 数字序号) {
        this.set种类序号(种类序号);
        this.set数字序号(数字序号);
    }

    public void test() {

    }
}
