package br.com.meli.FirstProjetct.controller;

import br.com.meli.FirstProjetct.domain.Aluno;
import br.com.meli.FirstProjetct.service.DiplomaService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("diploma")
public class DiplomaController {

    @PostMapping
    public String index(@RequestBody Aluno aluno){
        DiplomaService diplomaService = new DiplomaService();

        if ( diplomaService.calculaMedia(aluno) >= 9.0 ) return "Parabéns!! sua média foi: " + diplomaService.calculaMedia(aluno);

        return "A media do aluno foi: " + diplomaService.calculaMedia(aluno);
    }
}
