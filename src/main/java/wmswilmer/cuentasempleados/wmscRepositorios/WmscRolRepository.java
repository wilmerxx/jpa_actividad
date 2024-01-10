package wmswilmer.cuentasempleados.wmscRepositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import wmswilmer.cuentasempleados.wmscModelos.WmscRole;
import wmswilmer.cuentasempleados.wmscServicios.WmscRolService;

public interface WmscRolRepository extends JpaRepository<WmscRole, Integer> {
}
