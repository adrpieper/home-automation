package hello;

import hello.data.Measurement;
import hello.dao.MeasurementRepository;
import hello.temperature.RandomTemp;
import hello.temperature.Thermometer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class MeasuringStation {

    private Thermometer thermometer = new RandomTemp();
    private MeasurementRepository repository;

    @Autowired
    public MeasuringStation(MeasurementRepository repository) {
        this.repository = repository;
    }

    @Scheduled(fixedRate = 5000)
    public void measureTemperature() {
        repository.save(new Measurement(thermometer.getTemperature(),System.currentTimeMillis()));
    }
}