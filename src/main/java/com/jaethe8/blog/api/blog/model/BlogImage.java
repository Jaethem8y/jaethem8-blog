package com.jaethe8.blog.api.blog.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "blog_image")
public class BlogImage {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;
    @Lob
    @Column(name = "image", length = 16777215, columnDefinition = "mediumtext")
    private String image;
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JsonBackReference
    @JoinColumn(name = "blog_content_id")
    private BlogContent blogContent;
}
