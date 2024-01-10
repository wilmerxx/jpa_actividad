package wmswilmer.cuentasempleados.wmscRepositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import wmswilmer.cuentasempleados.wmscModelos.WmscAccount;

public interface WmscAccountRepository extends JpaRepository<WmscAccount, Integer> {

    public WmscAccount findWmscAccountByWmsc_id(String username);
}
