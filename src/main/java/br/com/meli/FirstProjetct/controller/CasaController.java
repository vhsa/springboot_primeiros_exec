package br.com.meli.FirstProjetct.controller;

import br.com.meli.FirstProjetct.domain.Casa;
import br.com.meli.FirstProjetct.service.CasaService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/casa")
public class CasaController {

    @PostMapping
    public String index(@RequestBody Casa casa) {

        CasaService casaService = new CasaService();

        return "Sua casa tem: " + casaService.calculaMetrosQuadrados(casa) + " mˆ2 \n" +
                "com o preco: R$" + casaService.calculaPrecoCasa(casa) + "\n" +
                "com o maior comodo sendo: " + casaService.maiorComodo(casa) + "\n" +
                "A quantidade de mˆ2 por comodo é: " + casaService.comodoPorMetroQuadrado(casa) + "\n";
    }
}
