package hello;

import com.vaadin.data.util.BeanItemContainer;
import com.vaadin.spring.annotation.SpringComponent;
import com.vaadin.spring.annotation.UIScope;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.Grid;
import hello.data.Measurement;
import hello.dao.MeasurementRepository;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Adi on 2016-05-06.
 */
@SpringComponent
@UIScope
public class MeasurementsView extends CustomComponent {

    private MeasurementRepository repo;

    @Autowired
    public MeasurementsView(MeasurementRepository repo) {
        this.repo = repo;

        Grid grid = new Grid();

        final BeanItemContainer<Measurement> source = new BeanItemContainer<>(Measurement.class, repo.findAll());
        grid.setContainerDataSource(source);
        grid.setColumns("temp","date");

        setCompositionRoot(grid);
    }
}
