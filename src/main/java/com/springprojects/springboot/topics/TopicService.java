package com.springprojects.springboot.topics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//business services in spring are singletons
@Service
public class TopicService {
    @Autowired
    private TopicRepository topicRepository;
//    private List<Topic> topics = new ArrayList<>(Arrays.asList(
//            new Topic("spring", "Spring Framework", "boom"),
//            new Topic("java", "Java Framework", "shaboom"),
//            new Topic("javascript", "JavaScript Framework", "bang")
//            ));

    //gets all the topics that are in the list
    //findAll, for each element that it finds in the database, it is going to add this to the list
    //returns a list
    public List<Topic> getAllTopics(){
        //return topics;
        List<Topic> topics = new ArrayList<>();
        topicRepository.findAll().forEach(topics::add);
        return topics;
    }

    //gets a single topic based on an id provided by the user
    public Topic getTopic(String id){
        // return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
        return topicRepository.findById(id).get();
    }

    //adds a topic to the database
    public void addTopic(Topic topic){
        //topics.add(topic);
        topicRepository.save(topic);
    }

    //updates a topic based on an id and an updated topic given by the user
    public void updateTopic(String id, Topic topic){
//        for (int i = 0; i < topics.size(); i++){
//            Topic t = topics.get(i);
//            if (t.getId().equals(id)){
//                topics.set(i, topic);
//                return;
//            }
//        }
        topicRepository.save(topic);
    }

    public void deleteTopic(String id){
//        topics.removeIf(t -> t.getId().equals(id));
        topicRepository.deleteById(id);
    }


}



