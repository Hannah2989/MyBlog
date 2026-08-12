package com.miniproject.myblog.comment;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {

    private final CommentRepository commentRepository;

    public CommentServiceImpl(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    @Override
    public List<Comment> findCommentByBlog(int blogId) {
        return commentRepository.findCommentByBlogIdAndApprovedTrue(blogId);
    }

    @Override
    public List<Comment> findAll() {
        return commentRepository.findAll();
    }

    @Override
    public void saveComment(Comment comment) {
        commentRepository.save(comment);
    }

    @Override
    public void approvedComment(int commentId) {
        Comment comment = commentRepository.findById(commentId).orElse(null);
        if (comment == null) return ;

        comment.setApproved(true);
        commentRepository.save(comment);
    }
}