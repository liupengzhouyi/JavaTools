package invitationCode.lpRandom.randomNumber;

import invitationCode.lpHashFactory.GetHashLastNumber;

public class GetRandomNumber {
    private String string = null;

    private RandomOneNumber randomOneNumber = null;

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = this.string + string;
    }

    public void init() {
        this.string = new String();
        this.randomOneNumber = new RandomOneNumber();
    }

    public GetRandomNumber() {
        this.init();
        String StringNumber = "";
        for (int i=0;i<3;i++) {
            randomOneNumber = new RandomOneNumber();
            StringNumber = randomOneNumber.getNumber();
            this.setString(StringNumber);
        }

    }

    public static void main(String[] args) {
        GetRandomNumber getRandomNumber = new GetRandomNumber();
        System.out.println(getRandomNumber.getString());
    }
}
