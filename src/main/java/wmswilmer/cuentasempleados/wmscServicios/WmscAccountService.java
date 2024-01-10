package wmswilmer.cuentasempleados.wmscServicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wmswilmer.cuentasempleados.wmscModelos.WmscAccount;
import wmswilmer.cuentasempleados.wmscRepositorios.WmscAccountRepository;

import java.util.List;

@Service
public class WmscAccountService {
    @Autowired
    WmscAccountRepository wmscAccountRepository;

    public List<WmscAccount> finAll(){
        return wmscAccountRepository.findAll();
    }

    public WmscAccount create(WmscAccount wmscAccount){
        return wmscAccountRepository.save(wmscAccount) ;
    }
}
