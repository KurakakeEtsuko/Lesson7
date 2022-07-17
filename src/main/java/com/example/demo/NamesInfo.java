package com.example.demo;

public class NamesInfo {

    private String name;
    private int number;

    public NamesInfo(String name, int number) {
	this.name = name;
	this.number = number;
    }

    public String getMenu() {
	return name;
    }

    public void setMenu(String name) {
	this.name = name;
    }

    public int getNumber() {
	return number;
    }

    public void setNumber(int number) {
	this.number = number;
    }

}
