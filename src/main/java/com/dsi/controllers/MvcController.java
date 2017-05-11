package com.dsi.controllers;

import com.dsi.models.Pie;
import com.dsi.repositories.PieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Collection;

@Controller
public class MvcController {

        @Autowired
        private PieRepository repository;

        @RequestMapping(name = "/student", method = RequestMethod.GET)


        public ResponseEntity<Collection<Pie>> getAllPies(){
            return new ResponseEntity<>((Collection<Pie>) repository.findAll(), HttpStatus.OK);
        }
        /*public String getAllPies(Model model){
            System.out.println("----Hi I Am Here-------");
            System.out.println("");
            

            model.addAttribute("dept","ICT");
          //  model.addAttribute("email","sumon050789@gmail.com");
            model.addAttribute("pieList", repository.findAll());
            return "student";
        }*/


}