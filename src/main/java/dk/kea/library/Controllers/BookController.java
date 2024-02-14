package dk.kea.library.Controllers;

import dk.kea.library.Models.Book;
import dk.kea.library.Repositories.BookRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/books")
public class BookController {

    private BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }


    @GetMapping
    public ResponseEntity<List<Book>> getBooks() {
        return ResponseEntity.ok(bookRepository.findAll());
    }


    @GetMapping("/{bookId}")
    public ResponseEntity<Book> getSingleBook(@PathVariable("bookId") long id) {
        return ResponseEntity.of(bookRepository.findById(id));
    }

    @PostMapping
    public ResponseEntity<Book> createBook(@RequestBody Book book) {
        return new ResponseEntity<>(bookRepository.save(book), HttpStatus.CREATED);
    }



}
