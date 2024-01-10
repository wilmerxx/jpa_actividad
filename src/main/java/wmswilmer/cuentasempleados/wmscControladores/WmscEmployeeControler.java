package wmswilmer.cuentasempleados.wmscControladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import wmswilmer.cuentasempleados.wmscModelos.WmscEmployee;
import wmswilmer.cuentasempleados.wmscServicios.WmscEmployeeService;

import java.util.List;

@RestController()
public class WmscEmployeeControler {
    @Autowired
    WmscEmployeeService wmscEmployeeService;

    @GetMapping("/employee")
    public ResponseEntity<?> findAll(){
        // si esta vacio que regrese el objeto con su estructura
        if(wmscEmployeeService.finAll().isEmpty()){
            WmscEmployee wmscEmployee = new WmscEmployee();
            return ResponseEntity.ok(wmscEmployee);
        }else{
            return ResponseEntity.ok(wmscEmployeeService.finAll());
        }

    }

    @GetMapping("/employee/{nombre}")
    public List<WmscEmployee> buscarPorNombre(@PathVariable String nombre){
        return  wmscEmployeeService.buscarPorNombre(nombre);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/employee")
    public WmscEmployee create(@RequestBody WmscEmployee wmscEmployee){
        return wmscEmployeeService.create(wmscEmployee);
    }

    @GetMapping("/employee/{nombre}/{position}")
    public List<WmscEmployee> buscarPorNombreAndPosition(@PathVariable String nombre, @PathVariable String position){
        return  wmscEmployeeService.buscarPorNombreAndPosition(nombre, position);
    }
}
