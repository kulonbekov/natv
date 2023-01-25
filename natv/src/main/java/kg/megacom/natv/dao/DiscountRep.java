package kg.megacom.natv.dao;

import kg.megacom.natv.models.entities.Discount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DiscountRep extends JpaRepository<Discount, Long> {
}
