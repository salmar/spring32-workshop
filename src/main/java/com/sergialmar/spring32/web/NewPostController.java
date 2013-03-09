package com.sergialmar.spring32.web;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sergialmar.spring32.domain.Post;
import com.sergialmar.spring32.service.PostService;

@Controller
@RequestMapping("/post/new")
public class NewPostController {

	@Inject
	private PostService postService;
	
	@RequestMapping(method=RequestMethod.GET)
	public String showPostForm(Post post) {
		return "post/new";
	}

	@RequestMapping(method=RequestMethod.POST)
	public String processPostForm(Post post) {
		postService.save(post);
		return "redirect:/home";
	}
}
