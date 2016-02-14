package dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "stud_add")
public class Address {
    @Id
    int add_id;
    String location;

    public Address() {
    }

    public Address(int add_id, String location) {
        this.add_id = add_id;
        this.location = location;
    }

    public int getAdd_id() {
        return add_id;
    }

    public void setAdd_id(int add_id) {
        this.add_id = add_id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }    
}
