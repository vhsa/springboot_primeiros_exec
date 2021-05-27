package br.com.meli.FirstProjetct.service;

import br.com.meli.FirstProjetct.domain.Aluno;
import br.com.meli.FirstProjetct.domain.Disciplina;

public class DiplomaService {

    public double calculaMedia(Aluno aluno) {
        return aluno.getNotas().stream().mapToDouble(Disciplina::getNota).average().orElse(0.0);
    }
}
