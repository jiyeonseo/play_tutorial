package controllers;

import play.mvc.*;
import models.Task;
import java.util.*;

public class Application extends Controller {

    public static void index() {
        List tasks =  Task.find("order by id desc").fetch();

        String name = "cheeeese";
        render(name);
    }
    public static void createTask(String title){
        Task task = new Task(title).save();
        renderJSON(task);
    }
    public static void changeStatus(Long id, boolean done){
        Task task = Task.findById(id);
        task.done = done;
        task.save();
        renderJSON(task);
    }

}