package dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "stud_yoyo")
public class Student {
    @Id
    int student_id;
    String student_name;

    public Student() {
    }

    public Student(int student_id, String student_name) {
        this.student_id = student_id;
        this.student_name = student_name;
    }
    
    @ManyToOne
    @JoinColumn(name = "add_id")
    Address add;

    public Address getAdd() {
        return add;
    }

    public void setAdd(Address add) {
        this.add = add;
    }

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }
}
