package com.springrest.springrest.entities;

import org.hibernate.annotations.Tables;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity

public class Student {
        
            @Id
			private long id;
            private String name;
            private String description;
            private String city;
            
            public Student(long id, String name, String description, String city) {
        		super();
        		this.id = id;
        		this.name = name;
        		this.description = description;
        		this.city = city;
        	}
            
            
        			public Student() {
        		super();
        		// TODO Auto-generated constructor stub
        	}


					public long getId() {
						return id;
					}


					public void setId(long id) {
						this.id = id;
					}


					public String getName() {
						return name;
					}


					public void setName(String name) {
						this.name = name;
					}


					public String getDescription() {
						return description;
					}


					public void setDescription(String description) {
						this.description = description;
					}


					public String getCity() {
						return city;
					}


					public void setCity(String city) {
						this.city = city;
					}


					@Override
					public String toString() {
						return "Student [id=" + id + ", name=" + name + ", description=" + description + ", city="
								+ city + "]";
					}
        			
        			
            
            
            
}
