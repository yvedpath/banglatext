package com;
import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.SequenceGenerator;
@Entity
@Table(name="bangla")
public class bangla
{
	@Id	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
        @Column(name="id",updatable=false,nullable=false)
	private long id;
	@Column(name="name")
	private String name;
	long getId(){return this.id;}
	String getName(){return this.name;}
	void setId(long i){this.id=i;}
	void setName(String t){this.name=t;}
}

