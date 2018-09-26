package com.stackroute.recommendation.repository;

import org.springframework.data.neo4j.repository.Neo4jRepository;

import com.stackroute.recommendation.domain.Genre;

public interface GenreRepository extends Neo4jRepository<Genre, Long> {

}
