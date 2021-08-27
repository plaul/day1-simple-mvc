package com.example.mvcday1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class Dat20iController {
    List<String> students =  new ArrayList<String>(Arrays.asList(
            "Adrian Enachi",
            "Aiste Kiausaite",
            "Alex Holst Hersfeldt",
            "Alexander John Condon",
            "Ana Karina Caro Hoyos",
            "Andre Jeronimo Camargo Bittencourt",
            "Andrei Cosmin Stan",
            "Artiom Tofan",
            "Bartosz Kochanski",
            "Chiara Visca",
            "Christine Wangari Kanyotu",
            "Christopher Leigh Millington",
            "Daniel Kohari",
            "Dominic Smith",
            "Georgi Emilov Dimitrov",
            "Gloria Grofova",
            "Juan Ignacio Nicolai",
            "Julieta Martina Amado",
            "Justas Zdanavicius",
            "Karolina Barbara Kwiatkowska",
            "Karolina Urnieziute",
            "Krishna Prasad Khanal",
            "Lars Rugholm Riel",
            "Madalin Petru Loghin",
            "Mahfuzur Rahman Shawon",
            "Mareks Lipnickis",
            "Mikkel Fehrmann Vermehren",
            "Nikolai Schreiber Hochloff Lenander",
            "Omar Said Farah",
            "Patrik Selecky",
            "Paul David Broch",
            "Pawel Stepien",
            "Periklis Vasileios Tsopanakos",
            "Petru-Razvan Ilisei",
            "Samuel Bartek",
            "Simon Bucko",
            "Snorri Sigurjónsson",
            "Tom Billington",
            "Veselin Plamenov Ivanov",
            "Vlad Bogdan Chivu",
            "Vlad-Radu Garau",
            "Zoan Leonela Nataren Peralta"));

    @GetMapping("/dat20i")
    public String allStudents(Model model){
        model.addAttribute("all",students);
        return "all-students";
    }
}

