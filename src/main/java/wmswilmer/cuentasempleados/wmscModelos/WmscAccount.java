package wmswilmer.cuentasempleados.wmscModelos;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "wmsc_account")
public class WmscAccount {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int wmsc_id;
    private String wmsc_password;
    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(name = "wmsc_account_role",
            joinColumns = @JoinColumn(name = "wmsc_account_id", referencedColumnName = "wmsc_id"),
            inverseJoinColumns = @JoinColumn(name = "wmsc_role_id", referencedColumnName = "wmsc_role_id"))
    private List<WmscRole> wmscRole;



}
