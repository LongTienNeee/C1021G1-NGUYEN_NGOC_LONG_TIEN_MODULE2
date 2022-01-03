package ss21_behavioral_design_pattern.thuc_hanh.trien_khai_lop_observe;

import javax.security.auth.Subject;

public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}