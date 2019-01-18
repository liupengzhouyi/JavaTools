package invitationCode.lpRandom.randomNumber;

import invitationCode.lpHashFactory.GetHashLastNumber;

public class GetRandomNumber {
    private String randomString = null;

    private RandomOneNumber randomOneNumber = null;

    public String getRandomString() {
        return randomString;
    }

    public void setRandomString(String randomString) {
        this.randomString = this.randomString + randomString;
    }

    public void init() {
        this.randomString = new String();
        this.randomOneNumber = new RandomOneNumber();
    }

    public GetRandomNumber() {
        this.init();
        String StringNumber = "";
        for (int i=0;i<3;i++) {
            randomOneNumber = new RandomOneNumber();
            StringNumber = randomOneNumber.getNumber();
            this.setRandomString(StringNumber);
        }

    }

    public static void main(String[] args) {
        GetRandomNumber getRandomNumber = new GetRandomNumber();
        System.out.println(getRandomNumber.getRandomString());
    }
}
