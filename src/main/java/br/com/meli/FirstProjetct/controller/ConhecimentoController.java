package br.com.meli.FirstProjetct.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping("/conhecimento")
public class ConhecimentoController {

    @GetMapping // Exemplo de query params
    public ResponseEntity<String> index(@RequestParam String name) {
        return new ResponseEntity<>("Bem vindo: " + name, HttpStatus.OK) ;
    }

    @GetMapping("/{idade}") // Exemplo de route params
    public ResponseEntity<String> show(@PathVariable String idade) {
        return new ResponseEntity<>("Sua idade é: " + idade, HttpStatus.OK);
    }
}
