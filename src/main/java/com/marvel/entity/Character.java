package com.marvel.entity;

import java.io.Serializable;
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
public class Character implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Long id;
	@Column
	private String name;
	@Column
	private String description;
	
	@ManyToMany
	private List<Comic> comic;
	@ManyToMany
	private List<Storie> storie;
	@ManyToMany
	private List<Event> event;
	@ManyToMany
	private List<Serie> serie;
		
	public Character() {
	}

	public Character(Long id, String name, String description, List<Comic> comic, List<Storie> storie,
			List<Event> event, List<Serie> serie) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.comic = comic;
		this.storie = storie;
		this.event = event;
		this.serie = serie;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
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
	public List<Event> getEvent() {
		return event;
	}
	public void setEvent(List<Event> event) {
		this.event = event;
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
		return "Character [id=" + id + ", name=" + name + ", description=" + description + ", comic="
				+ (comic != null ? comic.subList(0, Math.min(comic.size(), maxLen)) : null) + ", storie="
				+ (storie != null ? storie.subList(0, Math.min(storie.size(), maxLen)) : null) + ", event="
				+ (event != null ? event.subList(0, Math.min(event.size(), maxLen)) : null) + ", serie="
				+ (serie != null ? serie.subList(0, Math.min(serie.size(), maxLen)) : null) + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((comic == null) ? 0 : comic.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((event == null) ? 0 : event.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((serie == null) ? 0 : serie.hashCode());
		result = prime * result + ((storie == null) ? 0 : storie.hashCode());
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
		Character other = (Character) obj;
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
		if (event == null) {
			if (other.event != null)
				return false;
		} else if (!event.equals(other.event))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (serie == null) {
			if (other.serie != null)
				return false;
		} else if (!serie.equals(other.serie))
			return false;
		if (storie == null) {
			if (other.storie != null)
				return false;
		} else if (!storie.equals(other.storie))
			return false;
		return true;
	}
	
}
	
	