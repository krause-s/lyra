package de.uni_koeln.dh.lyra.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	// TODO song greeting
	@RequestMapping(value = { "", "/" })
	public String index(/*Model model*/) {
		return "index";
	}

	@RequestMapping(value = "/search")
	public String search(/*Model model*/) {
		return "search";
	}
	
	@RequestMapping(value = "/about")
	public String about() {
		return "about";
	}

}