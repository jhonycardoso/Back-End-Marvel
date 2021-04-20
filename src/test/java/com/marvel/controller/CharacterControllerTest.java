package com.marvel.controller;

import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;

import com.marvel.entity.Character;
import com.marvel.entity.Comic;
import com.marvel.entity.Event;
import com.marvel.entity.Serie;
import com.marvel.entity.Storie;
import com.marvel.service.CharactersService;

import io.restassured.http.ContentType;
import io.restassured.module.mockmvc.RestAssuredMockMvc;

@WebMvcTest
public class CharacterControllerTest {
	
	@Autowired
	private CharactersController characterController;
	
	@MockBean
	private CharactersService characterService;

	@BeforeEach
	public void setup() {
		RestAssuredMockMvc.standaloneSetup(this.characterController);
	}
	
	@Test
	public void retornarSucessoAoBuscarCharacterPeloId() {
		
		Character character = new Character(1L, "SPIDER-MAN", "SPIDER-MAN", null, null, null, null);
				
		when(this.characterService.findById(1L))
			.thenReturn(java.util.Optional.of(character));
		
		RestAssuredMockMvc.given()
			.accept(ContentType.JSON)
			.when().get("/v1/public/characters/{characterId}", 1L)
			.then()
			.statusCode(HttpStatus.OK.value());
	}
	
	@Test
	public void retornarFalhaAoBuscarCharacterPeloId() {
		
		Character character = new Character(0L, "SPIDER-MAN", "SPIDER-MAN", null, null, null, null);
				
		when(this.characterService.findById(0L))
			.thenReturn(java.util.Optional.of(character));
		
		RestAssuredMockMvc.given()
			.accept(ContentType.JSON)
			.when().get("/v1/public/characters/{characterId}", 1L)
			.then()
			.statusCode(HttpStatus.NOT_FOUND.value());
	}
	
	@Test
	public void retornarSucessoAoBuscarComicsPeloCharacterId() {
		Date data = new Date(System.currentTimeMillis());
		Comic comic = new Comic(1L, "CIVIL WAR - FIRST CHAPTER", "CIVIL WAR - FIRST CHAPTER", data, null, null, null);
		List<Comic> comics = new ArrayList<Comic>();
		comics.add(comic);
		
		Character character = new Character(5L, "IRON-MAN", "IRON-MAN", comics, null, null, null);
				
		when(this.characterService.findComicsByCharacterId(5L))
			.thenReturn(character.getComic());
		
		RestAssuredMockMvc.given()
			.accept(ContentType.JSON)
			.when().get("/v1/public/characters/{characterId}/comics", 5L)
			.then()
			.statusCode(HttpStatus.OK.value());
	}
	
	@Test
	public void retornarSucessoAoBuscarEventsPeloCharacterId() {
		Date data = new Date(System.currentTimeMillis());
		Event event = new Event(1L, "CIVIL WAR", "CIVIL WAR", data, data, null, null, null, null);
		List<Event> events = new ArrayList<Event>();
		events.add(event);
		
		Character character = new Character(5L, "IRON-MAN", "IRON-MAN", null, null, events, null);
				
		when(this.characterService.findEventsByCharacterId(5L))
			.thenReturn(character.getEvent());
		
		RestAssuredMockMvc.given()
			.accept(ContentType.JSON)
			.when().get("/v1/public/characters/{characterId}/comics", 5L)
			.then()
			.statusCode(HttpStatus.OK.value());
	}
	
	@Test
	public void retornarSucessoAoBuscarSeriesPeloCharacterId() {
		Date data = new Date(System.currentTimeMillis());
		Serie serie = new Serie(1L, "CIVIL WAR - SERIE", "CIVIL WAR - SERIE", data, data, null, null, null, null);
		List<Serie> series = new ArrayList<Serie>();
		series.add(serie);
		
		Character character = new Character(5L, "IRON-MAN", "IRON-MAN", null, null, null, series);
				
		when(this.characterService.findComicsByCharacterId(5L))
			.thenReturn(character.getComic());
		
		RestAssuredMockMvc.given()
			.accept(ContentType.JSON)
			.when().get("/v1/public/characters/{characterId}/comics", 5L)
			.then()
			.statusCode(HttpStatus.OK.value());
	}
	
	@Test
	public void retornarSucessoAoBuscarStoriesPeloCharacterId() {
		Storie storie = new Storie(1L, "AVENGERS VS X-MEN - STORIE", "AVENGERS VS X-MEN - STORIE", null, null, null, null);
		List<Storie> stories = new ArrayList<Storie>();
		stories.add(storie);
		
		Character character = new Character(5L, "IRON-MAN", "IRON-MAN", null, stories, null, null);
				
		when(this.characterService.findComicsByCharacterId(5L))
			.thenReturn(character.getComic());
		
		RestAssuredMockMvc.given()
			.accept(ContentType.JSON)
			.when().get("/v1/public/characters/{characterId}/comics", 5L)
			.then()
			.statusCode(HttpStatus.OK.value());
	}
	
	
}
