package com.jaethe8.blog.api.blog.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "blog_post")
public class BlogPost {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;
    @Column(name = "title", unique = true)
    private String title;
    @Column(name = "pub_date")
    private Timestamp date;
    @Lob
    @Column(name = "description", columnDefinition = "BLOB")
    private String description;
    @Column(name = "role")
    private String role;
    @Column(name = "frontend")
    private String frontend;
    @Column(name = "backend")
    private String backend;
    @Column(name = "general")
    private String general;
    @JsonManagedReference
    @OneToMany(mappedBy = "blogPost", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<BlogContent> blogContents = new ArrayList<>();
}