package com.sparta.blog.dto;

import lombok.Getter;

@Getter
public class BoardRequestDto {
    private String title;
    private String username;
    private String contents;
    private String password;
}
