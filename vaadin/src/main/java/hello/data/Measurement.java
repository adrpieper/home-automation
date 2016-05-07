package hello.data;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Adi on 2016-05-06.
 */
@Entity
public class Measurement {
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    @Id
    @GeneratedValue
    @JsonIgnore
    private Long id;

    @JsonIgnore
    private double value;

    @JsonIgnore
    private long timeStamp;

    protected Measurement(){

    }

    public Measurement(double value, long timeStamp) {
        this.timeStamp = timeStamp;
        this.value = value;
    }

    public Long getId() {
        return id;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public long getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(long timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getDate(){
        return dateFormat.format(new Date(timeStamp));
    }

    public String getTemp(){
        return String.format("%.3f",value);
    }
}
