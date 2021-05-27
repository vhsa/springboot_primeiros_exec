package br.com.meli.FirstProjetct.controller;

import br.com.meli.FirstProjetct.domain.RomanNumber;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/romanos")
public class RomanController {

    @GetMapping("{numero}")
    public ResponseEntity<String> index(@PathVariable int numero) {
        return ResponseEntity.status(HttpStatus.OK).body(numero + " -> " + RomanNumber.toRoman(numero));
    }
}
