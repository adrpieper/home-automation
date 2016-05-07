package hello.temperature;

import java.util.Random;

/**
 * Created by Adi on 2016-05-06.
 */
public class RandomTemp implements Thermometer {

    private Random random = new Random();
    private double lastTemp = 20;

    @Override
    public double getTemperature() {
        return lastTemp + 0.5 - random.nextDouble() + (20 - lastTemp) *0.01;
    }
}
