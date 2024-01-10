package wmswilmer.cuentasempleados.wmscRepositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import wmswilmer.cuentasempleados.wmscModelos.WmscPosition;

public interface WmscPositionRepository  extends JpaRepository<WmscPosition, Integer> {

}
