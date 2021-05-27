package br.com.meli.FirstProjetct.controller;

import br.com.meli.FirstProjetct.domain.Morse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/morse")
public class MorseController {

    @GetMapping("{palavra}")
    public String index (@PathVariable String palavra ) {
        return Morse.normal(palavra);
    }
}
