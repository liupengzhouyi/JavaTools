package Password;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

//@RunWith(Arquillian.class)
public class NewDateTpyesTest {
   /* @Deployment
    public static JavaArchive createDeployment() {
        return ShrinkWrap.create(JavaArchive.class)
                .addClass(NewDateTpyes.class)
                .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
    }*/

   @Test
    public void paly() throws Exception {
       NewDateTpyes newDateTpyes = new NewDateTpyes();
       newDateTpyes.setArrayList(new NewDateTpye(12,23));
       newDateTpyes.setArrayList(new NewDateTpye(23, 2));
       System.out.println(newDateTpyes.toString());
   }


}
