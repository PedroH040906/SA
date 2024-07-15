package Pedro.SAori.repository;

import Pedro.SAori.entity.Cnpj;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CnpjRepository extends JpaRepository<Cnpj, Long> {


}
