package kg.megacom.natv.dao;

import kg.megacom.natv.models.entities.Price;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PriceRep extends JpaRepository<Price, Long> {
}
