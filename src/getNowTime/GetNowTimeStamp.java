import getNowTime.BaseTime;

import java.util.Calendar;
import java.util.Date;

public class GetNowTimeStamp extends BaseTime {

    /**
     * 构造函数
     */
    public GetNowTimeStamp() {
        super();
        this.function();
    }

    /**
     * core function: get time stamp
     */
    public void function(){
        this.setInformation(this.getDate().getTime() + "");
    }
}
