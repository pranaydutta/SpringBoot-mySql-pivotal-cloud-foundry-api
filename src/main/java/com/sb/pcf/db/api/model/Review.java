package com.sb.pcf.db.api.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="REVIEW")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Review {
	
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String email;
	private int experience;
	private String companyName;
	private String interviewDate;
	private String interviewMode;
	private String jobDescription;
	private String primaryFocus;
	private String appliedFor;

}
