package com.rest.call;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class TopicController {
	
	@Autowired
	TopicService simpleService;
	
	@GetMapping("/get")
	public List<Topic> getAllTopic()
	{
		return simpleService.getAllTopic();
	}
	
	@GetMapping("/getOne/{id}")
	public Topic getOne (@PathVariable String id)
	{
		return simpleService.getById(id);
	}
	
	@PostMapping("/add")
	public void addTopic(@RequestBody Topic topic)
	{
		simpleService.addTopic(topic);
	}
	
	@PutMapping("/update/{id}")
	public void updateTopic(@PathVariable String id , @RequestBody Topic topic)
	{
		simpleService.updateTopic(id,topic);
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteTopic(@PathVariable String id)
	{
		simpleService.deleteTopic(id);
	}
}
