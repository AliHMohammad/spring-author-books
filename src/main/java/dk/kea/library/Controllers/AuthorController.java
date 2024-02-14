package dk.kea.library.Controllers;


import dk.kea.library.Models.Author;
import dk.kea.library.Repositories.AuthorRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/authors")
public class AuthorController {


    private AuthorRepository authorRepository;

    public AuthorController(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }


    @GetMapping
    public ResponseEntity<List<Author>> getAuthors() {
        return ResponseEntity.ok(authorRepository.findAll());
    }

    @GetMapping("/{authorId}")
    public ResponseEntity<Author> getSingleAuthor(@PathVariable("authorId") long id) {
        return ResponseEntity.of(authorRepository.findById(id));
    }

    @PostMapping
    public ResponseEntity<Author> createAuthor(@RequestBody Author author) {
        return new ResponseEntity<>(authorRepository.save(author), HttpStatus.CREATED);
    }



}
