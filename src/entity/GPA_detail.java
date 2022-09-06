package entity;

public class GPA_detail {
    private double mark;
    private subject Subject;

    public double getMark() {
        return mark;
    }

    public void setMark(double diem) {
        this.mark = mark;
    }

    public subject getSubject(){
        return Subject;
    }

    public void setSubject(subject Subject){
        this.Subject=Subject;
    }

    @Override
    public String toString() {
        return "GPA_detail{" +
                "nameSubject=" + Subject.getNameSubject() +
                ", mark=" + mark +
                '}';
    }
}
