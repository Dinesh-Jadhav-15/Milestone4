package com.mindtree;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mindtree.entity.Comment;
import com.mindtree.entity.Post;
import com.mindtree.entity.repo.PostRepo;

@SpringBootApplication
public class FetchApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(FetchApplication.class, args);
	}

	@Autowired
	private PostRepo postRepo;
	
	@Override
	public void run(String... args) throws Exception {
	
		Post post = new Post("One to  many mapping Using JPA","and description");
		
		Comment comment1  =new Comment("Very Useful");
		Comment comment2  =new Comment("Thnak you ");
		Comment comment3  =new Comment("Awesome");
		Comment comment4  =new Comment("informative");
		
		post.getComments().add(comment1);
		post.getComments().add(comment2);
		post.getComments().add(comment3);
		post.getComments().add(comment4);
	
		this.postRepo.save(post);
	}

}
