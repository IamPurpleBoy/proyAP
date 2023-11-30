package javaint.proyap.services;


import java.util.ArrayList;
import java.util.List;
import javaint.proyap.entities.Tecnico;
import javaint.proyap.entities.repository.TecnicoRepositorio;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nicolas
 */
public class TecnicoService {
    
    private TecnicoRepositorio tecnicoRepositorio;
    
    public TecnicoService(TecnicoRepositorio tecnicoRepositorio){
        this.tecnicoRepositorio = tecnicoRepositorio;
    }
    
    void agregarTecnico(Tecnico tecnico){};
    void actualizarTecnico(Tecnico tecnico){};
    Tecnico traerPorID(Long id){
        return new Tecnico( );
    };
    void eliminarTecnico(Long id){};
    List<Tecnico> traerTodosTecnicos(){
        return new ArrayList<>();
    };
    
}
