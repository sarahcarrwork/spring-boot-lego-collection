package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Lego {
	Long id;
	Long legoItemNumber;
	String name;
	String description;
    Long pieces;
	Integer year;

	//default constructor
	public Lego () {

    }

    public Lego(Long id, Long legoItemNumber, String name, String description, Long pieces, Integer year) {
        this.id = id;
        this.legoItemNumber = legoItemNumber;
        this.name = name;
        this.description = description;
        this.pieces = pieces;
        this.year = year;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getLegoItemNumber() {
        return legoItemNumber;
    }

    public void setLegoItemNumber(Long legoItemNumber) { this.legoItemNumber = legoItemNumber; }

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

    public Long getPieces() {
        return pieces;
    }

    public void setPieces(Long pieces) {
        this.pieces = pieces;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }
}
