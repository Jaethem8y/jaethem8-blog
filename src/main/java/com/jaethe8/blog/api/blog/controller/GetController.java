package com.jaethe8.blog.api.blog.controller;

import com.jaethe8.blog.api.blog.dto.BlogPostDTO;
import com.jaethe8.blog.api.blog.service.BlogService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.util.List;

@EnableWebMvc
@RestController
@RequiredArgsConstructor
public class GetController {
    private final BlogService blogService;

    @CrossOrigin
    @GetMapping("/")
    public List<BlogPostDTO> getBlogPosts() {
        return blogService.getAllBlogPost();
    }

    @CrossOrigin
    @GetMapping("/{title}")
    public BlogPostDTO getBlogPostByTitle(@PathVariable String title) throws Exception {
        return blogService.getBlogPostByTitle(title);
    }
}
