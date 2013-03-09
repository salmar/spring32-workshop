package com.sergialmar.spring32.service.impl;

import java.util.Calendar;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sergialmar.spring32.data.PostRepository;
import com.sergialmar.spring32.domain.Post;
import com.sergialmar.spring32.service.PostService;

public class PostServiceImpl implements PostService {
	
	private static final Logger logger = LoggerFactory.getLogger(PostServiceImpl.class);
	private PostRepository postRepository;

	public PostServiceImpl(PostRepository postRepository) {
		this.postRepository = postRepository;
	}
	
	public List<Post> findAll() {
		logger.debug("Retrieving all posts");
		return postRepository.findAll();
	}
	
	public void save(Post post) {
		post.setPublicationDate(Calendar.getInstance().getTime());
		postRepository.save(post);
	}
}
