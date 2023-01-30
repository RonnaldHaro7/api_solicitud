package uic.api_solicitud.solicitud_anteproyecto;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

@Service
public class SolicitudAnteproyectoService {
    @Autowired SolicitudAnteproyectoRepository solicitudAnteproyectoRepository;

    public SolicitudAnteproyecto save(SolicitudAnteproyecto entity){
        return solicitudAnteproyectoRepository.save(entity);
    }

    public SolicitudAnteproyecto findById( Long id){
        return solicitudAnteproyectoRepository.findById(id).orElse(new SolicitudAnteproyecto());
    }

    public void deleteById(Long id){
      solicitudAnteproyectoRepository.deleteById(id);
    }

    public List<SolicitudAnteproyecto> findAll(){
        return solicitudAnteproyectoRepository.findAll();
    }

    public List<SolicitudAnteproyecto> findAllWithPageAndSizeAndSort(int page, int size, String sort){
        Pageable paging = PageRequest.of(page, size, Sort.by(sort));
        return solicitudAnteproyectoRepository.findAll(paging).getContent();
    }

    public Long count(){
        return solicitudAnteproyectoRepository.count();
    }
}
