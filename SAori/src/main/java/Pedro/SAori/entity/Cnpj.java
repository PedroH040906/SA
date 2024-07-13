package Pedro.SAori.entity;

import Pedro.SAori.service.PessoaDTO;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Entity
@SuperBuilder
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "CNPJ")
public class Cnpj {
    //NESSE CASO AS ENTIDADES NÃO PODEM SE EXTENDER, A PARTE DE EXTENDER DEVE SER FEITO SOMENTE NOS DTOS, E DPS DESMEMBRAR E SALVAR NO BANCO DE FORMA CORRETA

    //PROBLEMA DE MAPEAMENTO
    //    @Id
//    @Column(name = "id_pessoa")
//    private Pessoa pessoa;
    //PROBLEMA FALTA DE ID TODA CLASSE DEVE TER ID
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
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