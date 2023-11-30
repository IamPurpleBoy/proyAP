package javaint.proyap;

import javaint.proyap.entities.repository.JpaTecnicoRepositorio;
import javaint.proyap.entities.repository.TecnicoRepositorio;
import javaint.proyap.entities.repository.dao.DAO;
import javaint.proyap.entities.repository.dao.JpaDAO;
import javaint.proyap.services.TecnicoService;

/**
 *
 * @author Nicolas
 */

public class Main{
    
    static TecnicoService tecnicoService;
    
    public static void main (String[] args){
        iniciar();
        System.out.println("hecho");
    }
        private static void iniciar(){
            DAO dao = new JpaDAO();
            TecnicoRepositorio tecnicoRepositorio = new JpaTecnicoRepositorio(dao);
            tecnicoService = new TecnicoService(tecnicoRepositorio);
        }
    }
