package com.miniproject.myblog.page;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    // صفحه اصلی
    @GetMapping("/")
    public String home() {
        return "home";
    }


    // صفحه نمایش مقاله
    @GetMapping("/blog")
    public String blog() {
        return "blog";
    }


    // صفحه ورود و ثبت نام
    @GetMapping("/auth")
    public String auth() {
        return "loginAndRegister";
    }


    // مدیریت وبلاگ ها
    @GetMapping("/admin/blogs")
    public String adminBlogs() {
        return "blogAdmin";
    }


    // مدیریت کامنت ها
    @GetMapping("/admin/comments")
    public String adminComments() {
        return "commentAdmin";
    }

    @GetMapping("/admin/addBlog")
    public String addBlog() {
        return "addBlog";
    }

}
