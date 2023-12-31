package com.sparta.blogapi.entity;

import com.sparta.blogapi.dto.BlogRequestDto;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Table(name = "bolgpost")
@NoArgsConstructor
public class Blog extends Timestamped{
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id; // 게시글 고유 id
        @Column(name = "title", nullable = false, length = 500)
        private String title; // 제목
        @Column(name = "username", nullable = false)
        private String username; //작성자명
        @Column(name = "contents", nullable = false, length = 500)
        private String contents; //작성내용


    public Blog(BlogRequestDto requestDto) {
        this.title = requestDto.getTitle();
        this.username = requestDto.getUsername();
        this.contents = requestDto.getContents();

    }

    public void update(BlogRequestDto requestDto) {
        this.title = requestDto.getTitle();
        this.username = requestDto.getUsername();
        this.contents = requestDto.getContents();
    }

    public void getPost(BlogRequestDto requestDto) {
        this.title = requestDto.getTitle();
        this.username = requestDto.getUsername();
        this.contents = requestDto.getContents();
    }
}
