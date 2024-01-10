package wmswilmer.cuentasempleados.wmscControladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import wmswilmer.cuentasempleados.wmscModelos.WmscPosition;
import wmswilmer.cuentasempleados.wmscServicios.WmscPositionServices;

@RestController
public class WmscPositionController {
    @Autowired
    WmscPositionServices wmscPositionService;

    @GetMapping("/position")
    public ResponseEntity<?> findAll(){
        // si esta vacio que regrese el objeto con su estructura
        if(wmscPositionService.finAll().isEmpty()){
            WmscPosition wmscPosition = new WmscPosition();
            return ResponseEntity.ok(wmscPosition);
        }else{
            return ResponseEntity.ok(wmscPositionService.finAll());
        }
    }

    @PostMapping("/position")
    public WmscPosition create(@RequestBody WmscPosition wmscPosition){
        return wmscPositionService.create(wmscPosition);
    }


}
