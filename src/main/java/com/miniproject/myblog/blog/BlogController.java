package com.miniproject.myblog.blog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/blogs")
public class BlogController {

    private final BlogService blogService;

    public BlogController(BlogService blogService) {
        this.blogService = blogService;
    }

    @PostMapping
    public String save(@ModelAttribute Blog blog) {
        blogService.save(blog);
        return "blogAdmin";
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
    @ResponseBody
    public List<Blog> findAll() {
        return blogService.findAll();
    }


}
