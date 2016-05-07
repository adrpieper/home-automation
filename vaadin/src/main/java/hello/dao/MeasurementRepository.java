package hello.dao;

import hello.data.Measurement;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Adi on 2016-05-06.
 */
public interface MeasurementRepository extends JpaRepository<Measurement, Long> {
}
