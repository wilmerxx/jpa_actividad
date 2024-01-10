package wmswilmer.cuentasempleados.wmscModelos;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@Table(name = "wmsc_role")
@NoArgsConstructor
@AllArgsConstructor
public class WmscRole {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int wmsc_role_id;
    private String wmsc_role_name;
    @ManyToMany(mappedBy = "wmscRole")
    @JsonIgnore
    private List<WmscAccount> wmscAccount;
}
