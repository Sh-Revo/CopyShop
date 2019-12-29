package TechSpec;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Brend {
    private Date year;
    private String name;
    private int sizeOfWorkers;
    private int sizeOfCountry;

    public Brend(String year, String name, int sizeOfWorkers, int sizeOfCountry) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        sdf.parse(year);
        this.year= sdf.getCalendar().getTime();
        this.name = name;
        this.sizeOfWorkers = sizeOfWorkers;
        this.sizeOfCountry = sizeOfCountry;
    }

    public Date getYear() {
        return year;
    }

    public String getName() {
        return name;
    }

    public int getSizeOfWorkers() {
        return sizeOfWorkers;
    }

    public int getSizeOfCountry() {
        return sizeOfCountry;
    }
}
