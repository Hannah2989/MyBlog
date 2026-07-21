package com.miniproject.myblog.blog;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/blogs")
public class BlogController {

    private final BlogService blogService;

    public BlogController(BlogService blogService) {
        this.blogService = blogService;
    }

    @PostMapping
    public void save(@ModelAttribute Blog blog) {
        blogService.save(blog);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable int id) {
        blogService.delete(id);
    }

    @GetMapping("/{id}")
    public Blog findById(@PathVariable int id) {
        return blogService.findById(id);
    }

    @GetMapping
    public List<Blog> findAll() {
        return blogService.findAll();
    }


}
