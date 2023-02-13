package com.dina.blog.repo;

import com.dina.blog.models.Post;
import org.springframework.data.repository.CrudRepository;
public interface PostRepository extends CrudRepository<Post, Long> {
}
