package wmswilmer.cuentasempleados.wmscServicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wmswilmer.cuentasempleados.wmscModelos.WmscRole;
import wmswilmer.cuentasempleados.wmscRepositorios.WmscRolRepository;

import java.util.List;

@Service
public class WmscRolService {
    @Autowired
    WmscRolRepository wmscRolRepository;

    public List<WmscRole> finAll(){
        return wmscRolRepository.findAll();
    }

    public WmscRole create(WmscRole wmscRole){
        return wmscRolRepository.save(wmscRole) ;
    }}
