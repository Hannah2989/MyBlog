package com.miniproject.myblog.comment;

import java.util.List;

public interface CommentService {

    List<Comment> findCommentByBlog(int blogId);

    List<Comment> findAll();

    void saveComment(Comment comment);

    void approvedComment(int commentId);
}