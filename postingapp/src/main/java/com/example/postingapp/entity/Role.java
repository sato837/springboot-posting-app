package com.example.postingapp.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "roles")
@Data //ゲッターやセッターなどを自動生成する

public class Role {
	
	@Id //主キー
	@GeneratedValue(strategy = GenerationType.IDENTITY) //主キー 自動採番されるようになる
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "name")
	private String name;

}
