package apo2;

import apo2.model.InfraestructureDeparment;
import org.junit.*;
import org.junit.Assert;

public class InfraestructureTest {

    @org.junit.Test
    public void testBillboardMethods() throws Exception {
        InfraestructureDeparment in = new InfraestructureDeparment();
        double average = in.avarageH();
        Assert.assertEquals(10.0, average, 7.0);
    }

    @org.junit.Test

        public void testW() throws Exception {
        InfraestructureDeparment in = new InfraestructureDeparment();
        double average = in.avarageW();
        Assert.assertEquals(2.3, average, 9.5);

    }

    @org.junit.Test
    public void testA() throws Exception {
        InfraestructureDeparment in = new InfraestructureDeparment();
        double average = in.avarageA();
        Assert.assertEquals(6.0, average, 9.5);

    }

}
