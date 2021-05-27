package br.com.meli.FirstProjetct.service;

import br.com.meli.FirstProjetct.domain.Casa;
import br.com.meli.FirstProjetct.domain.Comodos;
import org.springframework.aop.scope.ScopedProxyUtils;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class CasaService {

    public double calculaMetrosQuadrados(Casa casa) {
        double metrosQuadrados = 0;
        for ( Comodos c : casa.getComodos() ) {
            metrosQuadrados += c.getMetroQuadrado();
        }
        return metrosQuadrados;
    }

    public double calculaPrecoCasa ( Casa casa ) {
        return casa.getComodos().stream().mapToDouble( c -> (c.getMetroQuadrado() * 800.0)).sum();
    }

    public Comodos maiorComodo ( Casa casa ) {

        List<Comodos> comodos = casa.getComodos();

        Comodos comodo = null;
        double maiorMetroQuadrado = 0;

        for ( Comodos c: comodos ) {
            if ( c.getMetroQuadrado() > maiorMetroQuadrado ) {
                maiorMetroQuadrado = c.getMetroQuadrado();
                comodo = c;
            }
        }
        return comodo;
    }

    public Map<String, Double> comodoPorMetroQuadrado ( Casa casa ) {

        List<Comodos> comodos = casa.getComodos();

        Map<String, Double> comodo = new HashMap<>();

        for ( Comodos c: comodos ) {
            comodo.put(c.getNome(), c.getMetroQuadrado());
        }
        return comodo;
    }
}
