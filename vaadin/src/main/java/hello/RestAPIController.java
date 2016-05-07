package hello;

import hello.dao.MeasurementRepository;
import hello.data.Measurement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Adi on 2016-05-06.
 */
@RestController()
public class RestAPIController {

    private MeasurementRepository repository;

    @Autowired
    public RestAPIController(MeasurementRepository repository) {
        this.repository = repository;
    }

    @RequestMapping("api/temperature/measurements")
    public List<Measurement> measurements() {
        return repository.findAll();
    }
}
