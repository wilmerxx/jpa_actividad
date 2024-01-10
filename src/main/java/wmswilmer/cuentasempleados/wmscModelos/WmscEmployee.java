package wmswilmer.cuentasempleados.wmscModelos;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class WmscEmployee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int wmscid;
    private String wmscName;
    private String wmscEmail;

    @ManyToOne(optional = false)
    @JoinColumn(name = "wmscPosition_id", referencedColumnName = "wmsc_p_id", nullable = false)
    private WmscPosition wmscPosition;

}
