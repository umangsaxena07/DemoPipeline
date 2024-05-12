package com.example.demo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
public class TopicController {
    @Autowired
    private TopicService tp;
    @RequestMapping("/topics")
    public List<Topic> getAllTopics()
    {
        return tp.getAllTheTopics();
    }
    @RequestMapping("/topics/{id}")
    public Topic getTopic(@PathVariable String id)
    {
        return tp.getOneTopic(id);
    }
    @RequestMapping(method=RequestMethod.POST,value="/topics")
    public void addTopic(@RequestBody Topic t)
    {
        tp.addOneTopic(t);
    }
    @RequestMapping(method=RequestMethod.PUT,value="/topics/{id}")
    public void updateTopic(@RequestBody Topic t,@PathVariable String id)
        {
            tp.updateTopic(id,t);
        }
    @RequestMapping(method=RequestMethod.DELETE,value="/topics/{id}")
    public void deleteTopic(@PathVariable String id)
        {
            tp.deleteTopic(id);
        }
}