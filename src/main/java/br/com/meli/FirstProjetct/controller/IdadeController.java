package br.com.meli.FirstProjetct.controller;

import br.com.meli.FirstProjetct.domain.Idade;
import br.com.meli.FirstProjetct.service.IdadeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/idade")
public class IdadeController {

    @GetMapping("/{ano}/{mes}/{dia}")
    public String index(@PathVariable Integer ano, @PathVariable Integer mes, @PathVariable Integer dia) {

        IdadeService idadeService = new IdadeService();
        Idade idade = new Idade(ano, mes, dia);

        return "Sua idade é: " + idadeService.calculaIdade(idade);
    }
}
