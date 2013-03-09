package com.sergialmar.spring32.data;

import java.util.List;

import com.sergialmar.spring32.domain.Post;

public interface PostRepository {
	List<Post> findAll();
	Post save(Post post);
}
