package com.paul;

import com.paul.Dao.Dao;
import com.paul.service.HelloMessageService;
import javafx.scene.control.ScrollPane;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.swing.*;

import static java.lang.System.exit;

@SpringBootApplication
public class FirstprogramApplication implements CommandLineRunner{

	@Autowired
	private HelloMessageService helloService;

	public static void main (String[] args) throws Exception{

		SpringApplication app = new SpringApplication(FirstprogramApplication.class);
		app.setBannerMode(Banner.Mode.OFF);
		app.run(args);
	}
	@Value("${create.sql}")
	String delete;
	@Override
	public void run(String... args) throws Exception {
//		Dao dao=new Dao();
//		dao.create(create);
//		Dao dao = new Dao();
//		dao.insert(insert);
//		Dao dao = new Dao();
//		dao.update(update);
	}



}
