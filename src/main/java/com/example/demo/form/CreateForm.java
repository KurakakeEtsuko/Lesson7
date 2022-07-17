package com.example.demo.form;

import org.springframework.lang.NonNull;

public class CreateForm {

    @NonNull
    private String name;
    @NonNull
    private int number;

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public int getNumber() {
	return number;
    }

    public void setNumber(int number) {
	this.number = number;
    }

}
