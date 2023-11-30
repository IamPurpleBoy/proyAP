package javaint.proyap.entities.repository;


import java.util.List;
import javaint.proyap.entities.Tecnico;
import javaint.proyap.entities.repository.dao.DAO;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nicolas
 */
public class JpaTecnicoRepositorio implements TecnicoRepositorio{

    private DAO dao;
    
    public JpaTecnicoRepositorio(DAO dao){
        this.dao =dao;
    }
    
    @Override
    public void agregarTecnico(Tecnico tecnico) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void actualizarTecnico(Tecnico tecnico) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Tecnico traerPorID(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminarTecnico(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Tecnico> traerTodosTecnicos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
