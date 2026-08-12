package com.miniproject.myblog.comment;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/comments")
public class CommentController {

    private final CommentService commentService;

    public CommentController(CommentService commentService) {
        this.commentService = commentService;
    }

    @GetMapping
    public List<Comment> findAll() {
        return commentService.findAll();
    }

    @GetMapping("/{blogId}")
    public List<Comment> findByBlogId(@PathVariable int blogId) {
        return commentService.findCommentByBlog(blogId);
    }

    @PostMapping
    public void save(Comment comment) {
        commentService.saveComment(comment);
    }

    @GetMapping("/approved/{commentId}")
    public void approvedComment(@PathVariable int commentId) {
        commentService.approvedComment(commentId);
    }

}
