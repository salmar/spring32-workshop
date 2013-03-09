package com.sergialmar.spring32.web;

import java.util.List;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sergialmar.spring32.domain.Post;
import com.sergialmar.spring32.service.GreetingService;
import com.sergialmar.spring32.service.PostService;

@Controller
public class PostController {
	
	private static final Logger logger = LoggerFactory.getLogger(PostController.class);
	
	@Inject private GreetingService greetingService;
	@Inject private PostService postService;
	
	@RequestMapping(value = {"/", "/home"}, method = RequestMethod.GET)
	public String home(Model model) {
		model.addAttribute("greeting", greetingService.getUserGreeting());
		model.addAttribute("posts", postService.findAll());
		
		return "home";
	}

	@RequestMapping("/api/posts")
	public @ResponseBody List<Post> getPosts() {
		return postService.findAll();
	}
}
