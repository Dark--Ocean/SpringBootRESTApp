package com.dsi.controllers;

import com.dsi.models.Pie;
import com.dsi.repositories.PieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/pies")
public class PieRestController {

        @Autowired
        private PieRepository repository;

        @RequestMapping(method = RequestMethod.GET)
        public ResponseEntity<Collection<Pie>> getAllPies(){
            return new ResponseEntity<>((Collection<Pie>) repository.findAll(), HttpStatus.OK);
        }

        @RequestMapping(method = RequestMethod.GET, value = "/{id}")
        public ResponseEntity<Pie> getPieWithId(@PathVariable Long id) {
            return new ResponseEntity<>(repository.findOne(id),HttpStatus.OK);
        }

        @RequestMapping(method = RequestMethod.GET, params = {"name"})
        public ResponseEntity<Collection<Pie>> findPieWithName(@RequestParam(value="name") String name) {
            return new ResponseEntity<>(repository.findByName(name), HttpStatus.OK);
        }

        @RequestMapping(method = RequestMethod.POST)
        public ResponseEntity<?> addPie(@RequestBody Pie input) {
            return new ResponseEntity<>(repository.save(input), HttpStatus.CREATED);
        }
}