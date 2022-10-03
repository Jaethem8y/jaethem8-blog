package com.jaethe8.blog.api.blog.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "blog_link")
public class BlogLink {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;
    @Column(name = "tag")
    private String tag;
    @Column(name = "link")
    private String link;
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JsonBackReference
    @JoinColumn(name = "blog_content_id")
    private BlogContent blogContent;
}
