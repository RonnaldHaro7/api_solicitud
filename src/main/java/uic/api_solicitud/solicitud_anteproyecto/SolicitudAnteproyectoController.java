package uic.api_solicitud.solicitud_anteproyecto;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

import io.swagger.v3.oas.annotations.Operation;



@RestController
@RequestMapping("api/solicitud")
@CrossOrigin({"*"})
/**
* Controlador de la solicitud
*/
public class SolicitudAnteproyectoController {
    @Autowired SolicitudAnteproyectoService solicitudAnteproyectoService;


    @GetMapping(value= "/", params={"page","size","sort"})
    public List<SolicitudAnteproyecto> findAll(@RequestParam(defaultValue = "0") int page,
                                        @RequestParam(defaultValue = "10") int size,
                                        @RequestParam(defaultValue = "id") String sort){
        return solicitudAnteproyectoService.findAllWithPageAndSizeAndSort(page, size, sort);
    }

    @GetMapping("/")
    public List<SolicitudAnteproyecto> findAll(){
        return solicitudAnteproyectoService.findAll();
    }

    @GetMapping("/count/")
    public Long count(){
        return solicitudAnteproyectoService.count();
    }

    @Operation(summary = "Entrega una solicitud por su ID")
    @GetMapping("/{id}/")
    public SolicitudAnteproyecto findById(@PathVariable long id){
        return solicitudAnteproyectoService.findById(id);
    }

    @PostMapping("/")
    public SolicitudAnteproyecto save(@RequestBody SolicitudAnteproyecto entity){
        return solicitudAnteproyectoService.save(entity);
    }

    @Operation(summary = "Actualización de un producto por su ID")
    @PutMapping("/{id}/")
    public SolicitudAnteproyecto update(@RequestBody SolicitudAnteproyecto entity){
        return solicitudAnteproyectoService.save(entity);
    }

    @DeleteMapping("/{id}/")
    public void deleteById(@PathVariable Long id){
      solicitudAnteproyectoService.deleteById(id);
    }

    @PatchMapping("/{id}/")
    public ResponseEntity<SolicitudAnteproyecto> patch(@PathVariable Long id, @RequestBody Map<String, Object> fields) {
      SolicitudAnteproyecto product = solicitudAnteproyectoService.findById(id);
  
        // itera sobre los campos que se desean actualizar
        for (Map.Entry<String, Object> field : fields.entrySet()) {
            String fieldName = field.getKey();
            Object fieldValue = field.getValue();
            
            // utiliza reflection para establecer el valor del campo en la entidad
            try {
                Field campoEntidad = SolicitudAnteproyecto.class.getDeclaredField(fieldName);
                campoEntidad.setAccessible(true);
                campoEntidad.set(product, fieldValue);
            } catch (NoSuchFieldException | IllegalAccessException ex) {
                // maneja la excepción si ocurre algún error al acceder al campo
            }
        }
    
        // actualiza la entidad
        SolicitudAnteproyecto entidadActualizada = solicitudAnteproyectoService.save(product);
        return ResponseEntity.ok(entidadActualizada);
    }


}
