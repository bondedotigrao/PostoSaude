package model;

import model.classes.Paciente;
import java.util.List;
import model.InterfaceDao.Dao;
import model.InterfaceDao.PacienteDao;
import model.hibernate.PacienteHibernate;

public class PacienteModel {

    Dao<Paciente> dao = new PacienteHibernate();

    public void inserir(Paciente paciente) {
        if (((PacienteDao) dao).recuperarCpf(paciente.getCpf()) == null) {
            dao.inserir(paciente);
        }

    }

    public void alterar(Paciente paciente) {
        if (((PacienteDao) dao).recuperar(paciente.getId_paciente()) != null) {
            dao.alterar(paciente);
        }
    }

    public Paciente recupera(Integer codigo) {
        if (codigo == null) {
            return null;
        }

        return ((PacienteDao) dao).recuperar(codigo);
    }

    public void deletar(Paciente paciente) {
        if (((PacienteDao) dao).recuperar(paciente.getId_paciente()) != null) {
            dao.deletar(paciente);
        }
    }

    public List<Paciente> listarTodos() {
        return ((PacienteDao)dao).listarTodos();
    }

    public Paciente recuperarCpf(String cpf) {
        if (cpf == null) {
            return null;
        }

        return ((PacienteDao) dao).recuperarCpf(cpf);
    }
    public Paciente recuperarCartaoSus(String sus){
        
     if (sus == null) {
            return null;
        }

        return ((PacienteDao) dao).recuperarCartaoSus(sus);
    }
}
