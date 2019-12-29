package TechSpec;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class TimeLife  {
    private String data;
    private double temp;
    private int day;
    private String buff;

    public TimeLife(String data, double temp, int timeL) throws ParseException{
        this.data = data;
        this.temp = temp;
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(sdf.parse(data));
        calendar.add(Calendar.DATE,timeL);
        this.buff = sdf.format(calendar.getTime());
    }

    public String getBuff() {
        return buff;
    }

}
