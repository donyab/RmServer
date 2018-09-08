package ru.britishdesign.rm.server.controller;


import ru.britishdesign.rm.server.entity.Remind;
import ru.britishdesign.rm.server.entity.School;
import ru.britishdesign.rm.server.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ReminderController {

    private DataService service;

    @Autowired
    public void setDataService(DataService service){
        this.service = service;
    }

    @RequestMapping(value = "/reminders", method = RequestMethod.GET)
    @ResponseBody
    public List<Remind> getAllReminders(){
        return service.getAll();

    }

    @RequestMapping(value = "/reminders/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Remind getReminder(@PathVariable("id") long remindID){
        return service.getByID(remindID);

    }

    @RequestMapping(value = "/reminders", method = RequestMethod.POST)
    @ResponseBody
    public Remind saveReminder(@RequestBody Remind remind){
        return service.save(remind);

    }

    @RequestMapping(value = "/reminders/del/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public void delete(@PathVariable long id){
        service.remove(id);

    }

    @RequestMapping(value = "/schools", method = RequestMethod.GET)
    @ResponseBody
    public List<School> getAllSchool(){
        return service.getAllSchool();

    }
 }
