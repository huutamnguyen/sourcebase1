package com.example.demo.model;

import java.io.Serializable;
import java.time.Instant;

import javax.persistence.Column;

public abstract class BaseModel implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name = "created_date")
	private Instant createdDate;
	
	@Column(name = "updated_date")
	private Instant updatedDate;
	
	@Column(name = "is_deleted", columnDefinition = "boolean default false")
	private boolean isDeleted;
}
