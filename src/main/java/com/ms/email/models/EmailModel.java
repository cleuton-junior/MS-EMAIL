package com.ms.email.models;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Repository;

import com.ms.email.enums.StatusEmail;

import lombok.Data;
import lombok.Setter;

@Data
@Entity
@Table(name = "TB_EMAIL")
@Repository
public class EmailModel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long email;
	private String ownerRef;
	private String emailFrom;
	private String emailTo;
	private String subject;
	
	@Column(columnDefinition = "TEXT")
	private String text;
	private LocalDateTime sendDateEmail;
	private StatusEmail statusEmail;
}
