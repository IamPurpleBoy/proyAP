package javaint.proyap.entities.repository;


import javaint.proyap.entities.Tecnico;
import java.util.List;

/**
 *
 * @author Nicolas
 */
public interface TecnicoRepositorio {
    void agregarTecnico(Tecnico tecnico);
    void actualizarTecnico(Tecnico tecnico);
    Tecnico traerPorID(Long id);
    void eliminarTecnico(Long id);
    List<Tecnico> traerTodosTecnicos();
}
