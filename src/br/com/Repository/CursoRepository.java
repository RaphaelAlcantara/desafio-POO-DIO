package br.com.Repository;

import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

public class CursoRepository {
    List<Curso> cursoList = new ArrayList<>();

    public void create(Curso curso) {
        if (curso != null) {
            cursoList.add(curso);
        }
    }

    public void update(Curso curso, String titulo) {
        for (Curso c : cursoList) {
            if (c.getTitulo().equals(titulo)) {
                c.setTitulo(curso.getTitulo());
                c.setDescricao(curso.getDescricao());
                c.setCargaHoraria(curso.getCargaHoraria());
            }
        }
    }

    public Curso read(String titulo) {
        for (Curso c : cursoList) {
            if (c.getTitulo().equals(titulo)) {
                return c;
            }
        }
    }

    public void delete(String titulo) {
        for (Curso c : cursoList) {
            if (c.getTitulo().equals(titulo)) {
                cursoList.remove(cursoList.indexOf(c));
            }
        }
    }
}