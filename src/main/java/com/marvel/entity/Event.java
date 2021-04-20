package com.marvel.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table
public class Event implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Long id;
	@Column
	private String title;
	@Column
	private String description;
	@Column 
	private Date startDate;
	@Column 
	private Date endDate;
	
	@ManyToMany 
	private List<Character> character;
	@ManyToMany 
	private List<Comic> comic;
	@ManyToMany 
	private List<Storie> storie;
	@ManyToMany 
	private List<Serie> serie;
	
	public Event() {
	}
	
	public Event(Long id, String title, String description, Date startDate, Date endDate, List<Character> character,
			List<Comic> comic, List<Storie> storie, List<Serie> serie) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.startDate = startDate;
		this.endDate = endDate;
		this.character = character;
		this.comic = comic;
		this.storie = storie;
		this.serie = serie;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public List<Character> getCharacter() {
		return character;
	}
	public void setCharacter(List<Character> character) {
		this.character = character;
	}
	public List<Comic> getComic() {
		return comic;
	}
	public void setComic(List<Comic> comic) {
		this.comic = comic;
	}
	public List<Storie> getStorie() {
		return storie;
	}
	public void setStorie(List<Storie> storie) {
		this.storie = storie;
	}
	public List<Serie> getSerie() {
		return serie;
	}
	public void setSerie(List<Serie> serie) {
		this.serie = serie;
	}
	
	@Override
	public String toString() {
		final int maxLen = 10;
		return "Event [id=" + id + ", title=" + title + ", description=" + description + ", startDate=" + startDate
				+ ", endDate=" + endDate + ", character="
				+ (character != null ? character.subList(0, Math.min(character.size(), maxLen)) : null) + ", comic="
				+ (comic != null ? comic.subList(0, Math.min(comic.size(), maxLen)) : null) + ", storie="
				+ (storie != null ? storie.subList(0, Math.min(storie.size(), maxLen)) : null) + ", serie="
				+ (serie != null ? serie.subList(0, Math.min(serie.size(), maxLen)) : null) + "]";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((character == null) ? 0 : character.hashCode());
		result = prime * result + ((comic == null) ? 0 : comic.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((endDate == null) ? 0 : endDate.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((serie == null) ? 0 : serie.hashCode());
		result = prime * result + ((startDate == null) ? 0 : startDate.hashCode());
		result = prime * result + ((storie == null) ? 0 : storie.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Event other = (Event) obj;
		if (character == null) {
			if (other.character != null)
				return false;
		} else if (!character.equals(other.character))
			return false;
		if (comic == null) {
			if (other.comic != null)
				return false;
		} else if (!comic.equals(other.comic))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (endDate == null) {
			if (other.endDate != null)
				return false;
		} else if (!endDate.equals(other.endDate))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (serie == null) {
			if (other.serie != null)
				return false;
		} else if (!serie.equals(other.serie))
			return false;
		if (startDate == null) {
			if (other.startDate != null)
				return false;
		} else if (!startDate.equals(other.startDate))
			return false;
		if (storie == null) {
			if (other.storie != null)
				return false;
		} else if (!storie.equals(other.storie))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}
	
}
