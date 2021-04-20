package com.marvel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.marvel.entity.Character;

@Repository
public interface CharactersRepository extends JpaRepository<Character, Long>{
	
}
