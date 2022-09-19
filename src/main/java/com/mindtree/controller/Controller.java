 /* package com.mindtree.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.entity.Post;
import com.mindtree.entity.repo.PostRepo;

@RestController
public class Controller {
	@Autowired
	private Post post;

	@GetMapping("/post")
	public List<PostRepo> getAllPosts(@PathVariable String id){
		return getAllPosts(id);
	}
}
 */