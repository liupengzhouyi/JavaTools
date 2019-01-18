package invitationCode.createInvitation;

import invitationCode.prescription.*;

public class BeginTimeAndEndTime {

    private lpTime beginTime = null;

    private lpTime endTime = null;

    public lpTime getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(lpTime beginTime) {
        this.beginTime = beginTime;
    }

    public lpTime getEndTime() {
        return endTime;
    }

    public void setEndTime(lpTime endTime) {
        this.endTime = endTime;
    }

    public void init() {
        this.beginTime = new lpTime();
        this.endTime = new lpTime();
    }

    public void createBegin() {
        lpTime begin = new lpTime();
        this.setBeginTime(begin);
    }

    public void createEnd(int hour) {
        lpTime begin = this.getEndTime();
        Prescription prescription = null;
        if (hour == 1) {
            prescription = new Prescription1(begin);
        } else if (hour == 24) {
            prescription = new Prescription24(begin);
        } else if (hour == 72) {
            prescription = new Prescription72(begin);
        } else {
            prescription = new Prescription1(begin);
        }
        lpTime end = prescription.getTheLastTime();
        this.setEndTime(end);
    }

    public BeginTimeAndEndTime(int hour) {
        this.init();
        this.createBegin();
        this.createEnd(hour);
    }

    public void test1() {
        BeginTimeAndEndTime beginTimeAndEndTime = new BeginTimeAndEndTime(1);
        System.out.println(beginTimeAndEndTime.getBeginTime());
        System.out.println(beginTimeAndEndTime.getEndTime());
        System.out.println("-----------------------------------------");
    }

    public void test24() {
        BeginTimeAndEndTime beginTimeAndEndTime = new BeginTimeAndEndTime(24);
        System.out.println(beginTimeAndEndTime.getBeginTime());
        System.out.println(beginTimeAndEndTime.getEndTime());
        System.out.println("-----------------------------------------");
    }

    public void test72() {
        BeginTimeAndEndTime beginTimeAndEndTime = new BeginTimeAndEndTime(72);
        System.out.println(beginTimeAndEndTime.getBeginTime());
        System.out.println(beginTimeAndEndTime.getEndTime());
        System.out.println("-----------------------------------------");
    }

    public static void main(String[] args) {
        BeginTimeAndEndTime beginTimeAndEndTime = new BeginTimeAndEndTime(1);
        beginTimeAndEndTime.test1();
        beginTimeAndEndTime.test24();
        beginTimeAndEndTime.test72();
    }
}
