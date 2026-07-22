package com.miniproject.myblog.comment;

import java.util.List;

public interface CommentService {

    List<Comment> getAllComments();

    Comment findCommentById(int id);

    Comment createComment(Comment comment);

    void deleteComment(int id);

    Comment approveComment(int id);
}