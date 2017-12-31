package goit.springboot.project.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "event")
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "event")
    private String event;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "event")
    private Set<Employee> employees;

    public Event(){

    }

    public Event(int id, String event, Set<Employee> employees) {
        this.id = id;
        this.event = event;
        this.employees = employees;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public Set<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(Set<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public String toString() {
        return "Event{" +
                "id=" + id +
                ", event='" + event + '\'' +
                ", employees=" + employees +
                '}';
    }
}
