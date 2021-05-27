package br.com.meli.FirstProjetct.service;

import br.com.meli.FirstProjetct.domain.Idade;

import java.time.LocalDate;
import java.time.Period;

public class IdadeService {

    public int calculaIdade(Idade i) {
        LocalDate localDate = LocalDate.of(i.getAno(), i.getMes(), i.getDia());
        Period idade = Period.between(localDate, LocalDate.now());

        return idade.getYears();
    }
}
