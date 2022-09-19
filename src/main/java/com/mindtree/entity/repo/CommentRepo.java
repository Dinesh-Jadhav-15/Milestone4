package com.mindtree.entity.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.entity.Comment;

@Repository
public interface CommentRepo extends JpaRepository<Comment, Long> {

}
