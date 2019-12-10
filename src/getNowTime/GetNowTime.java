import getNowTime.BaseTime;

import java.text.SimpleDateFormat;

/**
 * funtion:获取当前时间
 * author：刘鹏
 * date:2019年8月29日
 * time:11点53分
 */
public class GetNowTime extends BaseTime {

    /**
     * 构造函数
     */
    public GetNowTime() {
        super();
        this.function();
    }

    /**
     * core function : get time
     */
    public void function() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        this.setInformation(dateFormat.format(this.getDate()));
    }
}
