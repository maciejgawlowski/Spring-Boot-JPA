package pl.gawlowski.maciej.service;

import org.springframework.data.repository.CrudRepository;

import pl.gawlowski.maciej.model.Topic;

public interface TopicRepository extends CrudRepository<Topic, String> { //String to typ primary key (id)

}
