package com.rest.call;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	private List<Topic> topics = new ArrayList<>(Arrays.asList(
new Topic("java","7","trycatch"),
new Topic("javaupdated","8","lambda")));

	public List<Topic> getAllTopic() {
		
		return topics;
	}

	public void addTopic(Topic topic) {
		topics.add(topic);
		
	}

	public void updateTopic(String id ,Topic topic) {
		for(int i = 0 ; i<topics.size();i++)
		{
			Topic t = topics.get(i);
			if(t.getId().equals(id))
			{
				topics.set(i, topic);
				return;
			}
		}
		
		
	}

	public void deleteTopic(String id) {
	topics.removeIf(t ->t.getId().equals(id));
		
	}

	public Topic getById(String id) {
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		 
	}

	
}
