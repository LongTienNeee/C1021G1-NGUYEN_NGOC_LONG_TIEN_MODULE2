package ss4_class_and_object.bai_tap.xay_dung_lop_stop_watch;

import java.time.LocalTime;

public class StopWatch {
    private LocalTime startTime;
    private LocalTime endTime;

    public startTime(){
        this.startTime = LocalTime.now();
    }

    public LocalTime getStartTime(){
        return startTime;
    }
    public LocalTime getEndTime(){
        return endTime;
    }
}
