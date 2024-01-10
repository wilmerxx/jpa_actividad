package wmswilmer.cuentasempleados.wmscServicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wmswilmer.cuentasempleados.wmscModelos.WmscEmployee;
import wmswilmer.cuentasempleados.wmscRepositorios.WmscEmployeeRepository;

import java.util.List;

@Service
public class WmscEmployeeService {
    @Autowired
    WmscEmployeeRepository wmscEmployeeRepository;

    public List<WmscEmployee> finAll(){
        return wmscEmployeeRepository.findAll();
    }

    public WmscEmployee create(WmscEmployee wmscEmployee){
        return wmscEmployeeRepository.save(wmscEmployee) ;
    }

    public List<WmscEmployee> buscarPorNombre(String nombre){
        return wmscEmployeeRepository.findWmscEmployeeByWmscName(nombre);
    }

    public List<WmscEmployee> buscarPorNombreAndPosition(String nombre, String position){
        return wmscEmployeeRepository.findWmscEmployeeByWmscNameAndWmscPosition(nombre, position);
    }
}
