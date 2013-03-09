package com.sergialmar.spring32.service;

import java.util.List;

import com.sergialmar.spring32.domain.Post;

public interface PostService {
	List<Post> findAll();
	void save(Post post);
}
