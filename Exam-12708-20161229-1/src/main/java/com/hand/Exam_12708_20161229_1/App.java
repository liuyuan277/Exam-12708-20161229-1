package com.hand.Exam_12708_20161229_1;

import java.util.Scanner;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hand.dto.Film;
import com.hand.service.FilmService;

public class App {
	public static void main( String[] args ){
		ConfigurableApplicationContext content=new ClassPathXmlApplicationContext("ApplicationContext.xml");	
		content.start();

		FilmService filmService=(FilmService) content.getBean("filmService");
		Scanner scanner=new Scanner(System.in);
		System.out.println("请输入电影名称 (title)\n");
		String title=scanner.nextLine();
		System.out.println("请输入电影描述 (description)\n");
		String description=scanner.nextLine();
		System.out.println("请输入语言ID (language_id)\n");
		String language_id=scanner.nextLine();	
		Film film=new Film();
		film.setTitle(title);
		film.setDescription(description);
		film.setLanguage_id(Integer.parseInt(language_id));
		filmService.insert(film);

		content.stop();
	}
}
