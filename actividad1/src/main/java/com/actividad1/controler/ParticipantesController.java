package com.actividad1.controler;


import com.actividad1.entity.ParticipantesEntity;
import com.actividad1.services.IParticipantesService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping("/participantes")
@RestController
@RequiredArgsConstructor
public class ParticipantesController {

    private final IParticipantesService participantesService;

    @GetMapping("/list/{id}")
    public Optional<ParticipantesEntity> findById(@PathVariable String id){
        return participantesService.findById(id);
    }

    @GetMapping("/listAll")
    public List<ParticipantesEntity> findAll(){
        return participantesService.findAll();
    }

    @PostMapping("/create")
    public ParticipantesEntity create(@RequestBody ParticipantesEntity entity){
        return participantesService.create(entity);
    }

    @PutMapping("/update/{id}")
    public  ParticipantesEntity update(@PathVariable String id, @RequestBody ParticipantesEntity entity){
        return  participantesService.update(id, entity);
    }

    @DeleteMapping("/delete/{id}")
    public Optional<ParticipantesEntity> delete(@PathVariable String id){
        participantesService.delete(id);
        return null;
    }
}
