package models;

import play.db.jpa.Model;

import javax.persistence.Entity;

@Entity
public class Task extends Model{
    public String title;
    public boolean done;

    public Task(String title){
        this.title = title;

    }
}
