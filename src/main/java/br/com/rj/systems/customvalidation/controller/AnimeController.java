package br.com.rj.systems.customvalidation.controller;

import br.com.rj.systems.customvalidation.model.Anime;
import br.com.rj.systems.customvalidation.repository.AnimeRepository;
import br.com.rj.systems.customvalidation.validations.annotations.MaxSizeValidation;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Validated
@RequiredArgsConstructor
@RestController
@RequestMapping("/animes")
public class AnimeController {

    private final AnimeRepository repository;

    @GetMapping
    public List<Anime> findAll(@RequestParam(value = "id") @MaxSizeValidation Integer id) {
        return this.repository.findAll();
    }

    @PostMapping
    public ResponseEntity<Anime> save(@RequestBody Anime anime) {
        var animeSaved = repository.save(anime);
        return ResponseEntity.status(HttpStatus.CREATED).body(animeSaved);
    }
}
