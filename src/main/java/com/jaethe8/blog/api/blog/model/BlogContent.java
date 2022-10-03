package com.jaethe8.blog.api.blog.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
@Entity
@Table(name = "blog_content")
public class BlogContent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "location")
    private int location;
    @Column(name = "header")
    private String header;
    @Lob
    @Column(name = "content", columnDefinition = "BLOB")
    private String content;
    @Lob
    @Column(name = "code", columnDefinition = "BLOB")
    private String code;
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JsonBackReference
    @JoinColumn(name = "blog_post_id")
    private BlogPost blogPost;
    @JsonManagedReference
    @OneToMany(mappedBy = "blogContent", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<BlogImage> blogImages = new ArrayList<>();
    @JsonManagedReference
    @OneToMany(mappedBy = "blogContent", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<BlogLink> blogLinks = new HashSet<>();
}
