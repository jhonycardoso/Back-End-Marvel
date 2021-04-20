package com.marvel.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marvel.entity.Character;
import com.marvel.entity.Comic;
import com.marvel.entity.Event;
import com.marvel.entity.Serie;
import com.marvel.entity.Storie;
import com.marvel.repository.CharactersRepository;

@Service
public class CharactersService {
	
	@Autowired
	private CharactersRepository charactersRepository;

	public List<Character> findAll() {
		return charactersRepository.findAll();
	}
	
	//Optional
	public Optional<Character> findById(Long id) {
		return charactersRepository.findById(id);
	}
	
	//Comics
	public List<Comic> findComicsByCharacterId(Long id){
		 List<Comic> comics = charactersRepository.findById(id).get().getComic();
		 return comics;
	}
	
	//Events
	public List<Event> findEventsByCharacterId(Long id){
		List<Event> events = charactersRepository.findById(id).get().getEvent();
		return events;
	}
	
	//Series
	public List<Serie> findSeriesByCharacterId(Long id){
		List<Serie> series = charactersRepository.findById(id).get().getSerie();
		return series;
	}
	
	//Stories
	public List<Storie> findStoriesByCharacterId(Long id){
		List<Storie> stories = charactersRepository.findById(id).get().getStorie();
		return stories;
	}
		
}
