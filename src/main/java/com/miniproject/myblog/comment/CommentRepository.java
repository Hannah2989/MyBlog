package com.miniproject.myblog.comment;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Integer> {

    List<Comment> findByBlogId(int blogId);

    List<Comment> findByApproved(Boolean approved);
}