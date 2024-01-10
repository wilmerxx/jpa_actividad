package wmswilmer.cuentasempleados.wmscModelos;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class WmscPosition {
    @Id
    private int wmsc_p_id;
    private String wmsc_p_name;
    @OneToMany(mappedBy = "wmscPosition", cascade = CascadeType.ALL)
    private List<WmscEmployee> wmscEmployeeList;
}
