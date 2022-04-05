package br.com.rj.systems.customvalidation.repository;

import br.com.rj.systems.customvalidation.model.Anime;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimeRepository extends JpaRepository<Anime, Integer> {
}
