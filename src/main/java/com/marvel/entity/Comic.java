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
public class Comic implements Serializable{

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
	private Date date;
		
	@ManyToMany 
	private List<Character> character;
	@ManyToMany 
	private List<Storie> storie;
	@ManyToMany 
	private List<Event> event;
	
	public Comic() {		
	}
	
	public Comic(Long id, String title, String description, Date date, List<Character> character, List<Storie> storie,
			List<Event> event) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.date = date;
		this.character = character;
		this.storie = storie;
		this.event = event;
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
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public List<Character> getCharacter() {
		return character;
	}
	public void setCharacter(List<Character> character) {
		this.character = character;
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

	@Override
	public String toString() {
		final int maxLen = 10;
		return "Comic [id=" + id + ", title=" + title + ", description=" + description + ", date=" + date
				+ ", character=" + (character != null ? character.subList(0, Math.min(character.size(), maxLen)) : null)
				+ ", storie=" + (storie != null ? storie.subList(0, Math.min(storie.size(), maxLen)) : null)
				+ ", event=" + (event != null ? event.subList(0, Math.min(event.size(), maxLen)) : null) + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((character == null) ? 0 : character.hashCode());
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((event == null) ? 0 : event.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		Comic other = (Comic) obj;
		if (character == null) {
			if (other.character != null)
				return false;
		} else if (!character.equals(other.character))
			return false;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
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
