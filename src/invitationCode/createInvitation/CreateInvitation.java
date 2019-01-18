package invitationCode.createInvitation;

import invitationCode.count.GetPrescriptionCount;
import invitationCode.lpHashFactory.GetHashLastNumber;
import invitationCode.lpRandom.randomChar.GetRandomChar;
import invitationCode.lpRandom.randomNumber.GetRandomNumber;

import java.lang.reflect.Array;

public class CreateInvitation {

    private String invitationCode = null;

    private GetPrescriptionCount getPrescriptionCount = null;

    private GetRandomNumber getRandomNumber = null;

    private GetRandomChar getRandomChar = null;

    public void createGetPrescriptionCount() {
        this.getPrescriptionCount = new GetPrescriptionCount();
    }

    public GetPrescriptionCount getGetPrescriptionCount() {
        return getPrescriptionCount;
    }

    public void setGetPrescriptionCount(GetPrescriptionCount getPrescriptionCount) {
        this.getPrescriptionCount = getPrescriptionCount;
    }

    public void createGetRandomNumber() {
        this.getRandomNumber = new GetRandomNumber();
    }

    public GetRandomNumber getGetRandomNumber() {
        return getRandomNumber;
    }

    public void setGetRandomNumber(GetRandomNumber getRandomNumber) {
        this.getRandomNumber = getRandomNumber;
    }

    public void createGetRandomChar() {
        this.getRandomChar = new GetRandomChar();
    }

    public GetRandomChar getGetRandomChar() {
        return getRandomChar;
    }

    public void setGetRandomChar(GetRandomChar getRandomChar) {
        this.getRandomChar = getRandomChar;
    }

    public String getInvitationCode() {
        return invitationCode;
    }

    public void setInvitationCode(String invitationCode) {
        this.invitationCode = invitationCode;
    }

    public void addInvitationCode(String string) {
        this.invitationCode = this.invitationCode + string;
    }

    public void init() {
        this.createGetPrescriptionCount();
        this.createGetRandomNumber();
        this.createGetRandomChar();
        this.invitationCode = new String();
    }


    //构造函数
    public CreateInvitation() {
        this.init();
        this.createCode();
        this.addHash();
        this.addPrefixNumber();
    }

    public void createCode() {
        String string = this.getGetRandomChar().getRandomString();
        String number = this.getGetRandomNumber().getRandomString();
        String tempString = "";
        for (int i=0; i<3; i++) {
            tempString = (string.charAt(i) + "");
            this.addInvitationCode(tempString);
            tempString = (number.charAt(i) + "");
            this.addInvitationCode(tempString);
        }
    }

    public void addHash() {
        String code = this.getInvitationCode();
        GetHashLastNumber getHashLastNumber = new GetHashLastNumber(code);
        int number = getHashLastNumber.getLastNumbeer();
        String StringNumber = number + "";
        this.addInvitationCode(StringNumber);
    }

    public void addPrefixNumber() {
        String PrefixNumber = this.getGetPrescriptionCount().getCount() + "";
        this.setInvitationCode(PrefixNumber + this.getInvitationCode());
    }

    public static void main(String[] args) {
        CreateInvitation createInvitation = new CreateInvitation();
        System.out.println(createInvitation.getInvitationCode());
    }
}
