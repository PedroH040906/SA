package Pedro.SAori.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table(name = "CNPJ")
public class Cnpj extends Pessoa {

    @Column(name = "cnpj")
    private String cnpj;
    @Column(name = "nome_fantasia")
    private String nomeFantasia;
    @Column(name = "tipo")
    private String tipo;
    @Column(name = "I.M")
    private String iM;
    @Column(name = "i.E")
    private String iE;
    @Column(name = "ramo_atividade")
    private String ramoAtividade;
}