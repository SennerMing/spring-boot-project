package org.springframework.boot.lxr.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/test")
public class MyTestController {

	@ResponseBody
	@RequestMapping("/hello")
	public String hello() {
		return "hello world";
	}
}
