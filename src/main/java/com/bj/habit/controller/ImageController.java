package com.bj.habit.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bj.habit.domain.response.ResponseData;

@Controller
@RequestMapping("/image")
public class ImageController extends BaseController{

	private Logger log = Logger.getLogger(getClass());
	
	@RequestMapping(value="/upload/{name}")
	public @ResponseBody ResponseData uploadImage(){
		
		
		return getOkResponseData();
	}
	
}
