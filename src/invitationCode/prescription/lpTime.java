package invitationCode.prescription;


import java.util.Calendar;
import java.util.Date;

public class lpTime {
    private Calendar calendar = null;

    public Calendar getCalendar() {
        return calendar;
    }

    public void setCalendar(Calendar calendar) {
        this.calendar = calendar;
    }

    private int year = 0;

    private int month = 0;

    private int day = 0;

    private int hour = 0;

    private int mintie = 0;

    private int s = 0;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMintie() {
        return mintie;
    }

    public void setMintie(int mintie) {
        this.mintie = mintie;
    }

    public int getS() {
        return s;
    }

    public void setS(int s) {
        this.s = s;
    }

    public void init() {
        int y,m,d,h,mi,s;
        calendar=Calendar.getInstance();
        y=calendar.get(Calendar.YEAR);
        this.setYear(y);
        m=calendar.get(Calendar.MONTH);
        this.setMonth(m + 1);
        d=calendar.get(Calendar.DATE);
        this.setDay(d);
        h=calendar.get(Calendar.HOUR_OF_DAY);
        this.setHour(h);
        mi=calendar.get(Calendar.MINUTE);
        this.setMintie(mi);
        s=calendar.get(Calendar.SECOND);
        this.setS(s);
    }

    public String getDate() {
        return this.getYear() + "-" + this.getMonth() + "-" + this.getDay();
    }

    public String getTime() {
        return this.getHour() + ":" + this.getMintie() + ":" + this.getS();
    }

    public lpTime() {
        this.init();
    }

    public lpTime(int year, int month, int day, int hour, int mintie, int s) {
        this.year = year;
        this.month = month;
        this.day = day;
        this.hour = hour;
        this.mintie = mintie;
        this.s = s;
    }

    public lpTime(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
        this.hour = 0;
        this.mintie = 0;
        this.s = 0;
    }



    @Override
    public String toString() {
        return this.getYear() + "-" + this.getMonth() + "-" + this.getDay() +
                " " + this.getHour() + ":" + this.getMintie() + ":" + this.getS();
    }

    public static void main(String[] args) {
        lpTime time = new lpTime();
        System.out.println(time.toString());
        System.out.println(time.getDate());
        System.out.println(time.getTime());
    }
}
