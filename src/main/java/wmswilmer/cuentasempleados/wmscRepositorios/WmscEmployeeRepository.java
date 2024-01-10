package wmswilmer.cuentasempleados.wmscRepositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import wmswilmer.cuentasempleados.wmscModelos.WmscEmployee;

import java.util.List;

public interface WmscEmployeeRepository extends JpaRepository<WmscEmployee, Integer> {

    //buscar por nombre
    List<WmscEmployee> findWmscEmployeeByWmscName(String nombre);
    @Query("SELECT e FROM WmscEmployee e WHERE e.wmscName = :wmscEmployeeName AND e.wmscPosition.wmsc_p_name = :wmscPositionName")
    List<WmscEmployee> findWmscEmployeeByWmscNameAndWmscPosition(@Param("employeeName") String wmscEmployeeName, @Param("positionName") String wmscPositionName);
}
