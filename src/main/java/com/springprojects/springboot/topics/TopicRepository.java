package com.springprojects.springboot.topics;

import org.springframework.data.repository.CrudRepository;

//jpa already provides the class that performs the CRUD methods (CrudRepository)
public interface TopicRepository extends CrudRepository<Topic, String> {

}
