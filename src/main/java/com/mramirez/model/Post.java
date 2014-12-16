package com.mramirez.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Post {
	
    @Id
    @GeneratedValue
	private int id;
	private String url;
	private String title;
	private int score;
	
	@ManyToOne
	private User owner;
	
	@OneToMany
	private List<Comments> comments;
}
