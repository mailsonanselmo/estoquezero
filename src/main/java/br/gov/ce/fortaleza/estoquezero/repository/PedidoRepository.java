package br.gov.ce.fortaleza.estoquezero.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PedidoRepository extends JpaRepository<br.gov.ce.fortaleza.estoquezero.model.Pedido, Long> {
	
}