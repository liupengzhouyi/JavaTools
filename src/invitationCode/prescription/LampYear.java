package invitationCode.prescription;

public class LampYear {

    private int NumberYear = -1;

    private String StringYear = null;

    private boolean LampYear = false;

    public void init() {
        this.StringYear = new String();
    }

    public int getNumberYear() {
        return NumberYear;
    }

    public void setNumberYear(int numberYear) {
        NumberYear = numberYear;
    }

    public String getStringYear() {
        return StringYear;
    }

    public void setStringYear(String stringYear) {
        StringYear = stringYear;
    }

    public void setLampYear(boolean lampYear) {
        LampYear = lampYear;
    }

    public boolean isLampYear() {
        return LampYear;
    }

    public LampYear(int numberYear) {
        this.init();
        NumberYear = numberYear;
        this.createLampYear(numberYear);
    }

    public LampYear(String stringYear) {
        this.init();
        StringYear = stringYear;
        int year = Integer.parseInt(stringYear);
        this.createLampYear(year);
    }

    public void createLampYear(int year) {
        if(year%4==0 && year%100!=0){
            this.setLampYear(true);
        }else if(year%400==0){
            this.setLampYear(true);
        } else {
            this.setLampYear(false);
        }
    }

    public static void main(String[] args) {
        lpTime time = new lpTime();
        LampYear lampYear = new LampYear(time.getYear());
        System.out.println(lampYear.isLampYear());
        invitationCode.prescription.LampYear lampYear1 = new LampYear(2000);
        System.out.println(lampYear1.isLampYear());
    }

}
