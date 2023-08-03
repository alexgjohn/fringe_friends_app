package controllers;

import models.Show;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import repositories.ShowRepository;

import java.util.List;

@RestController
public class ShowController {

    @Autowired
    ShowRepository showRepository;

    @GetMapping(value = "/shows")
    public ResponseEntity<List<Show>> getAllShows(){
        return new ResponseEntity<>(showRepository.findAll(), HttpStatus.OK);
    }

}
