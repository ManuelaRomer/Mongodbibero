package com.actividad1.repository;

import com.actividad1.entity.ParticipantesEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IParticipantesRepository extends MongoRepository<ParticipantesEntity, String> {
}
