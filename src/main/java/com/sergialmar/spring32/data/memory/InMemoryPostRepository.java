package com.sergialmar.spring32.data.memory;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.stereotype.Repository;

import com.sergialmar.spring32.data.PostRepository;
import com.sergialmar.spring32.domain.Post;

public class InMemoryPostRepository implements PostRepository {

	private final List<Post> posts = new CopyOnWriteArrayList<Post>();
	private AtomicInteger counter = new AtomicInteger();
	
	public List<Post> findAll() {
		return Collections.unmodifiableList(posts);
	}

	public Post save(Post post) {
		post.setId((long)counter.getAndIncrement());
		posts.add(post);
		return post;
	}

}
