package RandomNumber;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

@RunWith(Arquillian.class)
public class NumberTableTest {
    @Deployment
    public static JavaArchive createDeployment() {
        return ShrinkWrap.create(JavaArchive.class)
                .addClass(NumberTable.class)
                .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
    }

    @org.junit.Test
    public void getRandomNumber() {
    }

    @org.junit.Test
    public void setRandomNumber() {
    }

    @org.junit.Test
    public void getNumber() {
    }

    @org.junit.Test
    public void setNumber() {
    }

    @org.junit.Test
    public void getNumbers() {
    }

    @org.junit.Test
    public void setNumbers() {
    }

    @org.junit.Test
    public void getCountNumbers() {
    }

    @org.junit.Test
    public void setCountNumbers() {
    }

    @org.junit.Test
    public void createNumbers() {
    }

    @org.junit.Test
    public void addNumber() {
    }

    @org.junit.Test
    public void getRandNumber() {
    }

    @org.junit.Test
    public void init() {
    }

    @org.junit.Test
    public void addCountNumber() {
    }

    @org.junit.Test
    public void createRandomNumbers() {
    }

    @org.junit.Test
    public void showRandomNumberTable() {
    }

    @org.junit.Test
    public void main() {
    }
}
