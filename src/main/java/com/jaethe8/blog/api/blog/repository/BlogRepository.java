package com.jaethe8.blog.api.blog.repository;

import com.jaethe8.blog.api.blog.model.BlogPost;

import java.util.List;

public interface BlogRepository {
    public List<BlogPost> getAllBlogPost();
    public BlogPost getBlogPostByTitle(String title) throws Exception;
}

