package com.springprojects.springboot.course;

import org.springframework.data.repository.CrudRepository;
import java.util.List;
public interface CourseRepository extends CrudRepository<Course, String> {

    //pretty cool, can just create a method and it will already be implemented for you
    //just need to write it in the correct order
    //filters courses by the topicId
    public List<Course> findByTopicId(String topicId);

}
