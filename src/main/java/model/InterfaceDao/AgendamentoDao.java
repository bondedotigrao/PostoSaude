package model.InterfaceDao;

import java.util.List;
import model.classes.AgendamentoConsultas;
import model.classes.Paciente;

public interface AgendamentoDao extends Dao<AgendamentoConsultas> {
    
    public AgendamentoConsultas procurarData(String data);
    public List<AgendamentoConsultas> buscarAgendamento(Paciente paciente);
}
