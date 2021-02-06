package COVID.COVIDentryandexit.domain;

import javax.xml.crypto.Data;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Visitor {

    private Long stdid;
    private String name;
    private String entry_time;
    private String exit_time;

    public Long getStdid() {
        return stdid;
    }

    public void setStdid(Long stdid) {
        this.stdid = stdid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEntry_time() {
        return entry_time;
    }

    public void setEntry_time() {
        SimpleDateFormat format_entry = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date time = new Date();
        String entry_time = format_entry.format(time);

        this.entry_time = entry_time;
    }

    public String getExit_time() {
        return exit_time;
    }

    public void setExit_time() {
        SimpleDateFormat format_exit = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date time = new Date();
        String exit_time = format_exit.format(time);

        this.exit_time = exit_time;
    }
}
