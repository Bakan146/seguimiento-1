package apo2;

import apo2.model.billboard;
import org.junit.Assert;
import org.junit.Test;

public class BillboadTest {

    @Test
    public void testArea(){
        billboard obj = new billboard(100.0,40.0,true,"Icesi");
        double area = obj.getArea();
        Assert.assertEquals(4000.0, area,0.0);
    }


}