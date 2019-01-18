package invitationCode.prescription;

public class Prescription1 implements Prescription {

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

    public void init() {
        this.beginTime = new lpTime();
        this.lastTime = new lpTime();
    }

    @Override
    public void setTheLastTime() {
        int number = this.getLastTime().getHour();
        if (number == 23) {
            this.getLastTime().setHour(0);
            int day = this.getLastTime().getDay();
            if (day < 28) {
                //0-27
                this.getLastTime().setDay(day+ 1);
            } else if (day == 28) {
                //28
                int month = this.getLastTime().getMonth();
                int year = this.getLastTime().getYear();
                if (month == 1 || month == 3 || month == 5 || month == 7 ||
                        month == 8 || month == 10 || month == 12) {
                    //大月
                    this.getLastTime().setDay(29);
                } else {
                    //小月
                    this.getLastTime().setDay(29);
                }
                LampYear lampYear = new LampYear(year);
                if (lampYear.isLampYear()) {
                    // 是 - 闰 - 年
                    if (month == 2) {
                        //闰月有29
                        this.getLastTime().setDay(29);
                    }
                } else {
                    // 非闰年
                    if (month == 2) {
                        //二 - 月
                        this.getLastTime().setDay(1);
                        //月 - 份 - 加 - 一
                        this.getLastTime().setMonth(3);
                    }
                }
            } else if (day == 29) {
                //29
                int month = this.getLastTime().getMonth();
                if (month == 2) {
                    //二月
                    this.getLastTime().setMonth(3);
                    this.getLastTime().setDay(1);
                } else {
                    //非二月
                    this.getLastTime().setDay(day + 1);
                }
            }else if (day == 30) {
                //30
                int month = this.getLastTime().getMonth();
                if (month == 1 || month == 3 || month == 5 || month == 7 ||
                        month == 8 || month == 10 || month == 12) {
                    //大月
                    this.getLastTime().setDay(31);
                } else {
                    //小月
                    this.getLastTime().setDay(1);
                    this.getLastTime().setMonth(month + 1);
                }
            } else if (day == 31) {
                int month = this.getLastTime().getMonth();
                int year = this.getLastTime().getYear();
                //31
                if (month != 12) {
                    //非12月
                    this.getLastTime().setDay(1);
                    this.getLastTime().setMonth(month + 1);
                } else {
                    //12月
                    this.getLastTime().setDay(1);
                    this.getLastTime().setMonth(1);
                    this.getLastTime().setYear(year + 1);
                }
            }
        } else {
            this.getLastTime().setHour(number + 1);
        }
    }

    public Prescription1(lpTime time) {
        this.init();
        this.setBeginTime(time);
        this.setLastTime(time);
        this.setTheLastTime();
    }

    public static void main(String[] args) {
        lpTime time = new lpTime(2018, 12, 31, 23, 59, 59);
        Prescription1 prescription1 = new Prescription1(time);
        System.out.println(prescription1.getBeginTime());
        System.out.println(prescription1.getTheLastTime());
    }
}