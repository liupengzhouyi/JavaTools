package Password;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

//@RunWith(Arquillian.class)
public class getCharNumberTest {
    /*@Deployment
    public static JavaArchive createDeployment() {
        return ShrinkWrap.create(JavaArchive.class)
                .addClass(getCharNumber.class)
                .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
    }*/

    @Before
    public void setUp() throws Exception {
        System.out.println("开始对密码的单元测试!");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("结束对密码的单元测试!\n");
    }

    @Test
    public void init() {
        getCharNumber getCharNumber = new getCharNumber();

        getCharNumber.init();

        System.out.println(getCharNumber.getString1() + getCharNumber.getString2() + getCharNumber.getString3() + getCharNumber.getString4());
    }

    @Test
    public void setArrayList1() {
        getCharNumber getCharNumber = new getCharNumber();

        getCharNumber.init();

        for (int i=0;i<getCharNumber.getArrayList1().size();i++) {
            System.out.println(i  + ":" + getCharNumber.getArrayList1().get(i));
        }
    }

    @Test
    public void setArrayList2() {
        getCharNumber getCharNumber = new getCharNumber();

        getCharNumber.init();

        for (int i=0;i<getCharNumber.getArrayList2().size();i++) {
            System.out.println(i  + ":" + getCharNumber.getArrayList2().get(i));
        }
    }

    @Test
    public void setArrayList3() {
        getCharNumber getCharNumber = new getCharNumber();

        getCharNumber.init();

        for (int i=0;i<getCharNumber.getArrayList3().size();i++) {
            System.out.println(i  + ":" + getCharNumber.getArrayList3().get(i));
        }
    }

    @Test
    public void setArrayList4() {
        getCharNumber getCharNumber = new getCharNumber();

        getCharNumber.init();

        for (int i=0;i<getCharNumber.getArrayList4().size();i++) {
            System.out.println(i  + ":" + getCharNumber.getArrayList4().get(i));
        }
    }
}
