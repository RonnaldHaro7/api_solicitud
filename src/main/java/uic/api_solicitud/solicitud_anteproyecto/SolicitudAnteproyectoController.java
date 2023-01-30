package uic.api_solicitud.solicitud_anteproyecto;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("api/solicitudAnteproyecto")
@CrossOrigin({"*"})
public class    SolicitudAnteproyectoController {
 @Autowired SolicitudAnteproyectoService solicitudAnteproyectoService;
 @GetMapping("/")
 public List<SolicitudAnteproyecto> findAll(){
 return solicitudAnteproyectoService.findAll();
 }
 @GetMapping("/{id}/")
 public SolicitudAnteproyecto findById(@PathVariable Long id){
 return solicitudAnteproyectoService.findById(id);
 }
 @PostMapping("/")
 public SolicitudAnteproyecto save(@RequestBody SolicitudAnteproyecto entity){
 return solicitudAnteproyectoService.save(entity);
 }
 @PutMapping("/")
 public SolicitudAnteproyecto update(@RequestBody SolicitudAnteproyecto entity){
 return solicitudAnteproyectoService.save(entity);
 }
 @DeleteMapping("/{id}/")
 public void deleteById(@PathVariable Long id){
    solicitudAnteproyectoService.deleteById(id);
 }
}