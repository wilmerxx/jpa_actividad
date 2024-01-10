package wmswilmer.cuentasempleados.wmscModelos;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int wmsc_p_id;
    private String wmsc_p_name;
    @OneToMany(mappedBy = "wmscPosition", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<WmscEmployee> wmscEmployeeList;
}
