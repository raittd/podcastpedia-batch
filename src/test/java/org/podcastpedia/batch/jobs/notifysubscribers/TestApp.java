package org.podcastpedia.batch.jobs.notifysubscribers;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.podcastpedia.batch.common.entities.Episode;
import org.podcastpedia.batch.common.entities.User;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes = {StandaloneInfrastructureConfiguration.class, NotifySubscribersServicesConfiguration.class})
public class TestApp {

//	@Autowired
//	ReadDao readDao;
//	
//	@Test
//	public void testLoadPodcasts(){
//		
//		readDao.getMeUser();
//	}
	
	@PersistenceContext                  	
	private EntityManager entityManager;
	                                 
	
}    