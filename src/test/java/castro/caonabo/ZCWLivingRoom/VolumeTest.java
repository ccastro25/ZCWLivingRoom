package castro.caonabo.ZCWLivingRoom;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.experimental.theories.Theory;


/**
 * Created by castro on 9/9/16.
 */
public class VolumeTest {

    @Test
    public void getVolumeTest(){

        Televison televison = new Televison();


        Integer ecpectedValue =0;
        Integer acutualValue = televison.getVolume();

        assertEquals("the value should be 0",ecpectedValue,acutualValue);
    }

    @Test
    public void settingVolumeTester(){
        
       Televison televison2 = new Televison();
        televison2.setVolume(9);
        Integer expected= 9;
        Integer actual =9;
        assertEquals("the value should be ",expected,actual);



    }


}
