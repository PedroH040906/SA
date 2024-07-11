package Pedro.SAori.service;

import Pedro.SAori.entity.Pessoa;
import lombok.*;
import lombok.experimental.SuperBuilder;
import java.util.Date;

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class CpfDTO extends PessoaDTO{

    private String cpf;
    private Date dataNascimento;
    private Character genero;

}
