package com.fresh.coding.demoapi.controllers;

import com.fresh.coding.demoapi.entities.User;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@CrossOrigin
public class DemoController {

    @GetMapping("/deploy/api")
    public List<User> getAllUser() {
        return List.of(
                new User(1L, "Dupont", "Jean", "jean.dupont@example.com", LocalDate.of(1990, 1, 15)),
                new User(2L, "Martin", "Pierre", "pierre.martin@example.com", LocalDate.of(1985, 6, 23)),
                new User(3L, "Bernard", "Lucie", "lucie.bernard@example.com", LocalDate.of(1992, 3, 30)),
                new User(4L, "Thomas", "Marc", "marc.thomas@example.com", LocalDate.of(1988, 11, 2)),
                new User(5L, "Robert", "Sophie", "sophie.robert@example.com", LocalDate.of(1994, 9, 18)),
                new User(6L, "Petit", "Louis", "louis.petit@example.com", LocalDate.of(1987, 7, 25)),
                new User(7L, "Durand", "Claire", "claire.durand@example.com", LocalDate.of(1995, 12, 5)),
                new User(8L, "Lemoine", "Chloé", "chloe.lemoine@example.com", LocalDate.of(1991, 4, 10)),
                new User(9L, "Girard", "Alexandre", "alexandre.girard@example.com", LocalDate.of(1983, 2, 28)),
                new User(10L, "Dufresne", "Isabelle", "isabelle.dufresne@example.com", LocalDate.of(1996, 8, 13))
        );
    }
}
