package cn.liupengstudy.learningspringbootandmybatis.tools.getNowTime;

import java.text.SimpleDateFormat;

/**
 * funtion:获取当前日期
 * author：刘鹏
 * date:2019年8月29日
 * time:11点40分
 */
public class GetNowDate extends BaseTime {

    /**
     * 构造函数
     */
    public GetNowDate() {
        super();
        this.function();
    }

    /**
     * core function : get date
     */
    public void function() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        this.setInformation(dateFormat.format(this.getDate()));
    }

}
