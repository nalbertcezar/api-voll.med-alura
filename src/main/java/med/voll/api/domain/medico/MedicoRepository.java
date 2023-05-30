package med.voll.api.domain.medico;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicoRepository extends JpaRepository<Medico, Long> {
	List<Medico> findAllByAtivoTrue();

	Page<Medico> findAllByAtivoTrue(Pageable paginacao);
}
