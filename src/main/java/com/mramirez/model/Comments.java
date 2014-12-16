package com.mramirez.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Comments {
    @Id
    @GeneratedValue
	private String id;
	private String text;
}
