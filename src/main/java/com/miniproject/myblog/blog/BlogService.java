package com.miniproject.myblog.blog;

import java.util.List;

public interface BlogService {

    void save(Blog blog);

    void delete(Blog blog);

    Blog findById(int id);

    List<Blog> findAll();
}


