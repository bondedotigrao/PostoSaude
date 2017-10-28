package model.InterfaceDao;

import model.Paciente;

public interface PacienteDao extends Dao<Paciente> {

    public Paciente recuperarCartaoSus(String sus);

    public Paciente recuperarCpf(String cpf);

}
