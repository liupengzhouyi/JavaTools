package cn.liupengstudy.learningspringbootandmybatis.tools.getNowTime;

import java.util.Date;

public abstract class BaseTime {

    private Date date;

    private String information;

    public BaseTime() {
        this.init();
    }

    public void init() {
        this.setDate(new Date());
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }
}
