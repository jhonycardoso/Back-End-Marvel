package com.marvel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marvel.entity.Character;
import com.marvel.entity.Comic;
import com.marvel.entity.Event;
import com.marvel.entity.Serie;
import com.marvel.entity.Storie;
import com.marvel.error.ResourceNotFoundException;
import com.marvel.service.CharactersService;

@RestController
@RequestMapping("/v1/public/characters")
public class CharactersController {
	
	@Autowired
	CharactersService charactersService;
	
	@GetMapping("")
	private List<Character> findAllCharacters() {
		return charactersService.findAll();
	}
		
	@GetMapping("/{characterId}")
	private ResponseEntity<?> findCharacterById(@PathVariable("characterId") Long id) {
		verifyIfCharacterExists(id);
		return new ResponseEntity<>(charactersService.findById(id), HttpStatus.OK);
	}
		
	//Comics
	@GetMapping("/{characterId}/comics")
	private ResponseEntity<List<Comic>> findComicsByCharacterId(@PathVariable("characterId") Long id){
		//verifyIfCharacterExists(id);
		return new ResponseEntity<>(charactersService.findComicsByCharacterId(id), HttpStatus.OK);
	}
	
	//Events
	@GetMapping("/{characterId}/events")
	private ResponseEntity<List<Event>> findEventsByCharacterId(@PathVariable("characterId") Long id){
		verifyIfCharacterExists(id);
		return new ResponseEntity<>(charactersService.findEventsByCharacterId(id), HttpStatus.OK);
	}
	
	//Series
	@GetMapping("/{characterId}/series")
	private ResponseEntity<List<Serie>> findSeriesByCharacterId(@PathVariable("characterId") Long id){
		verifyIfCharacterExists(id);
		return new ResponseEntity<>(charactersService.findSeriesByCharacterId(id), HttpStatus.OK);
	}
	
	//Stories
	@GetMapping("/{characterId}/stories")
	private ResponseEntity<List<Storie>> findStoriesByCharacterId(@PathVariable("characterId") Long id){
		verifyIfCharacterExists(id);
		return new ResponseEntity<>(charactersService.findStoriesByCharacterId(id), HttpStatus.OK);
	}
	
	
	private void verifyIfCharacterExists(Long id) {
		if(!charactersService.findById(id).isPresent()) {
			throw new ResourceNotFoundException("Character not found for Id: " + id);
		}
	}
	
}
