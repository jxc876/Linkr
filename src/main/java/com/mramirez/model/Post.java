package com.mramirez.model;

import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Post {
	private String url;
	private String title;
	private List<Comments> comments;
	private User owner;
	private int score;
}
