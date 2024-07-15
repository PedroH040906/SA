package Pedro.SAori.service;

import Pedro.SAori.entity.Cnpj;
import Pedro.SAori.entity.Endereco;
import Pedro.SAori.repository.CnpjRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CnpjService {

    private CnpjRepository repository;

    public void post(CnpjDTO cnpjDTO){
        Cnpj cnpj = new Cnpj();
        cnpj.setTipo(cnpjDTO.getTipo());
        cnpj.setCnpj(cnpjDTO.getCnpj());
        cnpj.setNomeFantasia(cnpjDTO.getNomeFantasia());
        cnpj.setTipo(cnpjDTO.getTipo());
        cnpj.setIE(cnpjDTO.getIE());
        cnpj.setIM(cnpjDTO.getIM());
        cnpj.setRamoAtividade(cnpjDTO.getRamoAtividade());

        PessoaDTO pessoaDTO = new PessoaDTO();
        pessoaDTO.setNome(cnpjDTO.getNome());
        pessoaDTO.setTelefone(cnpjDTO.getTelefone());
        pessoaDTO.setObs(cnpjDTO.getObs());

        Endereco endereco = new Endereco();
        endereco.setLogradouro(cnpjDTO.getEndereco().getLogradouro());
        endereco.setBairro(cnpjDTO.getEndereco().getBairro());
        endereco.setNumero(cnpjDTO.getEndereco().getNumero());
        endereco.setCidade(cnpjDTO.getEndereco().getCidade());
        endereco.setEstado(cnpjDTO.getEndereco().getEstado());
        endereco.setComplemento(cnpjDTO.getEndereco().getComplemento());
        endereco.setCep(cnpjDTO.getEndereco().getCep());

        repository.save(cnpj);
    }
    public void save(Cnpj cnpj){
        repository.save(cnpj);
    }
}
