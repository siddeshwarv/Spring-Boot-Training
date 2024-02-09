package com.Demo.RelationMapping.model;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="Student")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="sid")
	private Integer sid;
	@Column(name="Name")
	private String name;
//	@ManyToOne
//	@JoinColumn(name="bidfk")
//	private Book book;
//	@OneToMany
//	@JoinColumn(name="StudentId")
//	Set<Book> book;
	@ManyToMany
	@JoinTable(
			name="Intertable",
			joinColumns=@JoinColumn(name="StudentId"),
			inverseJoinColumns = @JoinColumn(name="BOOk Id")
	)	
	Set<Book> book;
}
