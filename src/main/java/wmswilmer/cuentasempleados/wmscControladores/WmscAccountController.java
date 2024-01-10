package wmswilmer.cuentasempleados.wmscControladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import wmswilmer.cuentasempleados.wmscModelos.WmscAccount;
import wmswilmer.cuentasempleados.wmscServicios.WmscAccountService;

import java.util.List;

@RestController
public class WmscAccountController {

    @Autowired
    WmscAccountService wmscAccountService;

    @GetMapping("/account")
    public List<WmscAccount> findAll(){
        return wmscAccountService.finAll();
    }

    @PostMapping("/account")
    public WmscAccount create(WmscAccount wmscAccount){
        return wmscAccountService.create(wmscAccount);
    }




}
