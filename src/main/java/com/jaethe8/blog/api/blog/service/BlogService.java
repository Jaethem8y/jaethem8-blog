package com.jaethe8.blog.api.blog.service;

import com.jaethe8.blog.api.blog.dto.BlogPostDTO;
import com.jaethe8.blog.api.blog.model.BlogPost;

import java.util.List;

public interface BlogService {
    public List<BlogPostDTO> getAllBlogPost();
    public BlogPostDTO getBlogPostByTitle(String title) throws Exception;
    public BlogPost mapBlogPost(BlogPostDTO blogPostDTO, BlogPost blogPost);
    public BlogPostDTO blogPostToDTO(BlogPost blogPost);

}
