package com.ivanov_sergey.module4.controller;

import com.ivanov_sergey.module4.ActorDTO;
import com.ivanov_sergey.module4.model.Actor;
import com.ivanov_sergey.module4.model.Customer;
import com.ivanov_sergey.module4.service.ActorService;
import com.ivanov_sergey.module4.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/actors")
public class ActorController {

    private final ActorService actorService;

    public ActorController(ActorService actorService) {
        this.actorService = actorService;
    }

    @GetMapping("")
    public Integer getAllActors(){
        List<Actor> allActors = actorService.getAllActors();
        System.out.println(allActors);
        return allActors.size();
    }
//
//    @PostMapping("/customer")
//    public Customer saveActor(@RequestBody Actor actor){
//        customerService.createActor(actor);
//        return actor;
//    }
//
    @GetMapping("/actor/{id}")
    public ActorDTO getActorById(@PathVariable Short id){
        Optional<Actor> optionalActor = actorService.getById(id);
        Actor actor = optionalActor.get();
        return ActorDTO.builder()
                .firstName(actor.getFirstName())
                .lastName(actor.getLastName())
                .build();
    }
}
