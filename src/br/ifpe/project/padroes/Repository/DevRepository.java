package br.ifpe.project.padroes.Repository;

import java.util.ArrayList;
import java.util.List;
import br.ifpe.project.model.negocios.Dev;

public class DevRepository {
    List<Dev> devList = new ArrayList<>();

    public void create(Dev dev) {
        if (dev != null) {
            devList.add(dev);
        }
    }

    public void update(Dev dev, String nome) {
        for (Dev d : devList) {
            if (d.getNome().equals(nome)) {
                d.setNome(dev.getNome());
            }
        }
    }

    public Dev read(String nome) {
        for (Dev d : devList) {
            if (d.getNome().equals(nome)) {
                return d;
            }
        }
        return null;
    }

    public List<Dev> readAll() {
        List<Dev> dvList = new ArrayList<>();
        for (Dev d : devList) {
            dvList.add(d);
        }
        return dvList;
    }

    public void delete(String nome) {
        for (Dev d : devList) {
            if (d.getNome().equals(nome)) {
                devList.remove(devList.indexOf(d));
            }
        }
    }

}