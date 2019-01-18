package invitationCode;

import invitationCode.prescription.LampYear;
import invitationCode.prescription.lpTime;

public class TestLampYear {

    public void test01() {
        lpTime time = new lpTime();
        LampYear lampYear = new LampYear(time.getDate());
        System.out.println(lampYear.isLampYear());
    }

}
