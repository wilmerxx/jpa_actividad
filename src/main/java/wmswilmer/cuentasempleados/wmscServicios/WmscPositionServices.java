package wmswilmer.cuentasempleados.wmscServicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wmswilmer.cuentasempleados.wmscModelos.WmscPosition;
import wmswilmer.cuentasempleados.wmscRepositorios.WmscPositionRepository;

import java.util.List;

@Service
public class WmscPositionServices {
    @Autowired
    private WmscPositionRepository wmscPositionRepository;

    public List<WmscPosition> finAll(){
        return wmscPositionRepository.findAll();
    }

    public WmscPosition create(WmscPosition wmscPosition){
        return wmscPositionRepository.save(wmscPosition);
    }
}
