package Password;

import java.util.ArrayList;

public class NewDateTpyes {

    private ArrayList<NewDateTpye> arrayList = null;

    public NewDateTpyes() {
        this.init();
    }

    public void init() {
        this.arrayList = new ArrayList<>();
    }

    public ArrayList<NewDateTpye> getArrayList() {
        return arrayList;
    }

    public void setArrayList(NewDateTpye newDateTpye) {
        this.getArrayList().add(newDateTpye);
    }

    @Override
    public String toString() {

        String string = "";

        string = string + this.getArrayList().get(0).toString() ;

        for (int i=1;i<this.getArrayList().size();i++) {
            string = string + "-" + this.getArrayList().get(i).toString() ;
        }

        return string;
    }
}
