package com.example.demo;
 
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
 
import org.springframework.stereotype.Service;
 
@Service
public class TopicService {
 
    Topic topic[]={new Topic("spring","spring framework","spring framework descriptionnn"),
            new Topic("java","core java","core java description")};
 
    List<Topic> topics=new ArrayList<Topic>(Arrays.asList(topic));
 
    public List<Topic> getAllTheTopics()
    {
        return topics;
    }
    public Topic getOneTopic(String id)
    {
        return topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
    }
    public void addOneTopic(Topic t)
    {
        topics.add(t);
    }
    public void updateTopic(String id, Topic t) {
        int i;
        for(i=0;i<topics.size();i++)

        {
            Topic t2=topics.get(i);
            if(t2.getId().equals(id))
            {
                topics.set(i,t);
                return;
            }
        }

    }
    public void deleteTopic(String id) {
        topics.removeIf(t->t.getId().equals(id));

    }
 
}