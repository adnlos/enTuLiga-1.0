package com.entuliga.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

		@RequestMapping("/index.htm")
		public String redirect()
		{
			return "indexApp";
		}
}