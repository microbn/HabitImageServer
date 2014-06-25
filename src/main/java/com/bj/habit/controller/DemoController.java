package com.bj.habit.controller;

import java.io.File;
import java.io.IOException;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/demo")
public class DemoController extends BaseController {

	private Logger log = Logger.getLogger(getClass());
	
	@RequestMapping(value="/createfile/{name}")
	public void createFile(@PathVariable String name){
		File file = new File("E:/"+name+".txt");
		if(!file.exists()){
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		log.info("----------create file:"+name);
	}
}
