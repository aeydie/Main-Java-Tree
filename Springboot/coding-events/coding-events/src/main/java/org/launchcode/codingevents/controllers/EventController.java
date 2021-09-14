package org.launchcode.codingevents.controllers;

import org.launchcode.codingevents.models.Event;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("events")
public class EventController {

    private static List<Event> events = new ArrayList<>();

    @GetMapping
    public String displayAllEvents(Model model) {
        model.addAttribute("title", "All Events");
        model.addAttribute("events", events);
//        events.put("Menteaship","A fun meetup for connecting with mentors");
//        events.put("Code With Pride","A fun meetup sponsored by LaunchCode");
//        events.put("Javascripty","An imaginary meetup for Javascript developers");
//        model.addAttribute("events", events);
        return "events/index";
    }



    @GetMapping("create")
    public String displayCreateEventForm(Model model) {
        model.addAttribute("title", "Create Event");
        return "events/create";
    }

    @PostMapping("create")
    public String processCreateEventForm(@RequestParam String eventName, String eventDescription) {
        events.add(new Event(eventName));
        return "redirect:";
    }

}
//package org.launchcode.codingevents.controllers;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//
//import java.util.ArrayList;
//import java.util.List;
//
///**
// * Created by Chris Bay
// */
//@Controller
//@RequestMapping("events")
//public class EventController {
//
//    private static List<String> events = new ArrayList<>();
//
//    @GetMapping
//    public String displayAllEvents(Model model) {
//        model.addAttribute("events", events);
//        return "events/index";
//    }
//
//    @GetMapping("create")
//    public String renderCreateEventForm() {
//        return "events/create";
//    }
//
//    @PostMapping("create")
//    public String createEvent(@RequestParam String eventName) {
//        events.add(eventName);
//        return "redirect:";
//    }
//
