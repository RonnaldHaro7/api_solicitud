package uic.api_solicitud.solicitud_anteproyecto;

import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class SolicitudAnteproyecto {
 @Id
 @GeneratedValue(strategy = GenerationType.AUTO)
 private Long id;
 private String tema;
 private String nombre_profesor;
 private String periodo_lectivo;
 private Date fecha;
}