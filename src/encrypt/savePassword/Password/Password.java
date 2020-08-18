package encrypt.savePassword.Password;

import RandomNumberII.CreateRandomNumber;

/**
 * @文件名 encrypt.savePassword.Password
 * @描述 
 * @创建人  liupeng
 * @作者联系方式 LIUPENG.0@outlook.com
 * @创建时间  2020/8/14 - 11:53 下午
 * @修改人和其它信息
 */

public class Password {

    public String createPassword(String turePassword) {
        String ppp = turePassword;
        String password = "";
        // 正在创建秘文
        System.out.println("正在创建秘文...");
        CreateRandomNumber createRandomNumber;
        for (int i=0;i<50;i++) {
            for (int j=0; j<10;j++) {
                createRandomNumber = new CreateRandomNumber(2, 8);
                password = password + createRandomNumber.getRandomNumbers();
                System.out.print(createRandomNumber.getRandomNumbers());
            }
            System.out.println();
        }

        System.out.println("创建秘文完成✅");

        // 正在加密
        System.out.println("正在对秘文加密🔐...");

        char[] passs = password.toCharArray();

        int longth = ppp.length();

        String lastPassword = "";

        for (int i=0;i<longth;i++) {
            String temp = "";
            int t = (byte)ppp.charAt(i);
            for (int k=0;k<200;k++) {
                temp = temp + passs[i * 200 + k];
            }
            lastPassword = lastPassword + encryptionI(temp, t);
        }
        for (int i=0;i<20-longth;i++) {
            String temp = "";
            for (int k=0;k<200;k++) {
                temp = temp + passs[i * 200 + k];
            }
            lastPassword = lastPassword + encryptionII(temp);
        }


        System.out.println(lastPassword);

        System.out.println("秘文加密🔐完成✅");
        return lastPassword;
    }

    public String encryptionI(String str, int number) {
        // str = "bd1m7m3ay612n73b4bkthuzp4t57rreh6pmdvcbib53mpf3e5n3vezqyo6w6ag20c1z7my6pjfmb670vhzf3j6qj1ntnachfmoya8u8tlczcllsims46bcmq4y6jizl4gb0imihovi10qfywaiyqinhcecf5mijpa3n6uzasloeu5qqqna891gp8wtygyqykyjakakdl";
        StringBuilder strBuilder = new StringBuilder(str);
        for (int i=0;i<128;i++) {
            if ((byte)str.charAt(i) == i) {
                strBuilder.setCharAt(i, (char)((byte)str.charAt(i) - 2));
            }
        }
        strBuilder.setCharAt(number, (char)number);
        str=strBuilder.toString();
        return str;
    }

    public String encryptionII(String str) {
        // str = "bd1m7m3ay612n73b4bkthuzp4t57rreh6pmdvcbib53mpf3e5n3vezqyo6w6ag20c1z7my6pjfmb670vhzf3j6qj1ntnachfmoya8u8tlczcllsims46bcmq4y6jizl4gb0imihovi10qfywaiyqinhcecf5mijpa3n6uzasloeu5qqqna891gp8wtygyqykyjakakdl";
        StringBuilder strBuilder = new StringBuilder(str);
        for (int i=0;i<128;i++) {
            if ((byte)str.charAt(i) == i) {
                if((char)((byte)str.charAt(i) - 2) == '\n') {
                    strBuilder.setCharAt(i, (char)((byte)str.charAt(i) - 5));
                } else {
                    strBuilder.setCharAt(i, (char)((byte)str.charAt(i) - 2));
                }

            }
        }
        str=strBuilder.toString();
        return str;
    }


    public static void main(String[] args) {
        Password p = new Password();
        p.createPassword("Lp1hkbk");
    }

}
