package hello.data;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Adi on 2016-05-06.
 */
public class MeasurementTest {


    @Test
    public void getTemp() throws Exception {
        final Measurement measurement = new Measurement(2.3123, System.currentTimeMillis());
        System.out.println(measurement.getTemp());;

    }

}