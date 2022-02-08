package com.te.email.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name =  "mail_info")
public class MailInfo {
	@Id
	private int id;
	private int from;
	private int to;
	private String subject;
	private String message;
	private String status;
}
