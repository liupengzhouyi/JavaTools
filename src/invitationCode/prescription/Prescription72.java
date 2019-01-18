package invitationCode.prescription;

public class Prescription72 implements Prescription {

    private lpTime beginTime = null;

    private lpTime lastTime = null;

    public lpTime getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(lpTime beginTime) {
        this.beginTime = beginTime;
    }

    public lpTime getLastTime() {
        return lastTime;
    }

    public void setLastTime(lpTime lastTime) {
        this.lastTime = lastTime;
    }

    @Override
    public lpTime getTheLastTime() {
        return this.getLastTime();
    }

    @Override
    public void setTheLastTime() {
        lpTime time = this.getLastTime();
        int year = time.getYear();
        int month = time.getMonth();
        int day = time.getDay();
        LampYear lampYear = new LampYear(year);
        boolean isLampYear = lampYear.isLampYear();
        if (day <= 25) {
            this.getLastTime().setDay(day + 3);
        } else if (day == 26) {
            if (month == 2) {
                if (isLampYear) {
                    this.getLastTime().setDay(29);
                } else {
                    this.getLastTime().setMonth(3);
                    this.getLastTime().setDay(1);
                }
            } else {
                this.getLastTime().setDay(29);
            }
        } else if (day == 27) {
            if (month == 2) {
                this.getLastTime().setMonth(3);
                if (isLampYear) {
                    this.getLastTime().setDay(2);
                } else {
                    this.getLastTime().setDay(1);
                }
            } else {
                this.getLastTime().setDay(30);
            }
        } else if (day == 28) {
            if (month == 2) {
                if (isLampYear) {
                    this.getLastTime().setDay(2);
                } else {
                    this.getLastTime().setDay(3);
                }
                this.getLastTime().setMonth(3);
            } else if (month == 1 || month == 3 || month == 5 || month == 7 ||
                    month == 8 || month == 10 || month == 12) {
                this.getLastTime().setDay(31);
            } else {
                this.getLastTime().setDay(1);
                month = month + 1;
                this.getLastTime().setMonth(month);
            }
        } else if (day == 29) {
            if (month == 2) {
                this.getLastTime().setDay(3);
                this.getLastTime().setMonth(3);
            } else if (month == 1 || month == 3 || month == 5 || month == 7 ||
                    month == 8 || month == 10 || month == 12) {
                this.getLastTime().setDay(1);
                if (month == 12) {
                    this.getLastTime().setMonth(1);
                    this.getLastTime().setYear(year + 1);
                } else {
                    this.getLastTime().setMonth(month + 1);
                }
            } else {
                this.getLastTime().setDay(2);
                month = month + 1;
                this.getLastTime().setMonth(month);
            }
        } else if (day == 30) {
            if (month == 1 || month == 3 || month == 5 || month == 7 ||
                    month == 8 || month == 10 || month == 12) {
                this.getLastTime().setDay(2);
                if (month == 12) {
                    this.getLastTime().setMonth(1);
                    this.getLastTime().setYear(year + 1);
                } else {
                    this.getLastTime().setMonth(month + 1);
                }
            } else {
                this.getLastTime().setDay(2);
                month = month + 1;
                this.getLastTime().setMonth(month);
            }
        } else if (day == 31) {
            if (month == 1 || month == 3 || month == 5 || month == 7 ||
                    month == 8 || month == 10 || month == 12) {
                this.getLastTime().setDay(3);
                if (month == 12) {
                    this.getLastTime().setMonth(1);
                    this.getLastTime().setYear(year + 1);
                } else {
                    this.getLastTime().setMonth(month + 1);
                }
            } else {
                this.getLastTime().setDay(3);
                month = month + 1;
                this.getLastTime().setMonth(month);
            }
        }
    }

    public void init() {
        this.beginTime = new lpTime();
        this.lastTime = new lpTime();
    }

    public Prescription72(lpTime time) {
        this.init();
        this.setBeginTime(time);
        this.setLastTime(time);
        this.setTheLastTime();
    }

    public static void main(String[] args) {
        lpTime time = new lpTime(2018, 12, 31, 12, 59, 59);
        Prescription prescription = new Prescription72(time);
        System.out.println(prescription.getTheLastTime());
    }
}
