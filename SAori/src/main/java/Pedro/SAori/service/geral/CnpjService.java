package Pedro.SAori.service.geral;

import Pedro.SAori.entity.Cnpj;
import Pedro.SAori.repository.CnpjRepository;
import Pedro.SAori.repository.EnderecoRepository;
import Pedro.SAori.repository.PessoaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CnpjService {

    CnpjRepository repository;
    private final PessoaRepository pessoaRepository;
    private final EnderecoRepository enderecoRepository;


    public void post(Cnpj cnpjDTO){

    }
}
