package pl.gawlowski.maciej.service;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import pl.gawlowski.maciej.domain.Topic;
import pl.gawlowski.maciej.springbootjpa.SpringbootJpaApplication;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringbootJpaApplication.class)
@Transactional
public class TopicServiceTest {

	@Autowired
	private TopicService service;
	
	@Before
	public void setUp(){
	}
	
	@Test
	public void getAllTopicsTest(){
		List list = service.getAllTopics();
		Assert.assertEquals(list.size(), 0);
		
		service.addTopic(new Topic("topic1","topic1 full name","topic1 description"));
		service.addTopic(new Topic("topic2","topic2 full name","topic2 description"));
		list = service.getAllTopics();
		Assert.assertEquals(list.size(), 2);
	}
	
}
