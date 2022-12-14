package org.BuzzToOffice.learningspring.utils;

import org.BuzzToOffice.learningspring.data.RoomRepository;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class AppStartupEvent implements ApplicationListener<ApplicationReadyEvent>{

	private final RoomRepository roomRepository;

	
	public AppStartupEvent(RoomRepository roomRepository) {
		this.roomRepository = roomRepository;
	}

	@Override
	public void onApplicationEvent(ApplicationReadyEvent event) {
		this.roomRepository.findAll().forEach(System.out::println);
	}
	
}
