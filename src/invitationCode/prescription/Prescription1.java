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
    public lpTime getTheLastTime(lpTime time) {
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
            this.getLastTime().setHour(1);
            int day = this.getLastTime().getDay();
            if (day > 28) {
                //yue
            } else {
                this.getLastTime().setDay(day + 1);
            }
        } else {
            this.getLastTime().setHour(number + 1);
        }
    }

    public Prescription1(lpTime time) {
        this.setBeginTime(time);
        this.setLastTime(time);
    }
}
