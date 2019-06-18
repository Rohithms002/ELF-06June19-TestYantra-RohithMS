package com.tyss.javaapp.file;

import java.io.Serializable;

public class Person implements Serializable {

	String name;
	transient int id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
