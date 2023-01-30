package uic.api_solicitud.solicitud_anteproyecto;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface SolicitudAnteproyectoRepository extends CrudRepository<SolicitudAnteproyecto, Long> {

    public List<SolicitudAnteproyecto> findAll();
    Page<SolicitudAnteproyecto> findAll(Pageable pageable);
    
}
