package wmswilmer.cuentasempleados.wmscControladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import wmswilmer.cuentasempleados.wmscModelos.WmscRole;
import wmswilmer.cuentasempleados.wmscServicios.WmscRolService;

@RestController
public class WmscRolController {
    @Autowired
    WmscRolService wmscRolService;

    @GetMapping("/rol")
    public ResponseEntity<?> findAll(){
        return ResponseEntity.ok(wmscRolService.finAll());
    }

    @PostMapping("/rol")
    public ResponseEntity<?> create(@RequestBody WmscRole wmscRole){
        return ResponseEntity.ok(wmscRolService.create(wmscRole));
    }

}
