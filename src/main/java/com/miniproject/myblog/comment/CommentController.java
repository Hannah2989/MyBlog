package com.miniproject.myblog.comment;

import com.miniproject.myblog.blog.Blog;
import com.miniproject.myblog.blog.BlogService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/comments")
public class CommentController {

    private final CommentService commentService;
    private final BlogService blogService;

    public CommentController(CommentService commentService,
                             BlogService blogService) {
        this.commentService = commentService;
        this.blogService = blogService;
    }

    @PostMapping("/blogs/{blogId}")
    public String createComment(@PathVariable int blogId,
                                @ModelAttribute Comment comment) {

        Blog blog = blogService.findById(blogId);

        comment.setBlog(blog);

        commentService.createComment(comment);

        return "redirect:/blogs/" + blogId;
    }

    @GetMapping("/approve/{id}")
    public String approveComment(@PathVariable int id) {

        commentService.approveComment(id);

        return "redirect:/blogs";
    }

    @GetMapping("/delete/{id}")
    public String deleteComment(@PathVariable int id) {

        commentService.deleteComment(id);

        return "redirect:/blogs";
    }

}