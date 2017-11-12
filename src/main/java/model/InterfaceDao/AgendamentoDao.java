package model.InterfaceDao;

import model.classes.AgendamentoConsultas;

public interface AgendamentoDao extends Dao<AgendamentoConsultas> {
    
    public AgendamentoConsultas procurarData(String data);
    
    
}
