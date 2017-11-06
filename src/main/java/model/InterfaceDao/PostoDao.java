package model.InterfaceDao;

import model.Posto;

public interface PostoDao extends Dao<Posto> {

    public Posto retornaNome(String nome);
}
