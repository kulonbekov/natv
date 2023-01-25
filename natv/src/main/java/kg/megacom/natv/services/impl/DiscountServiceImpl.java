package kg.megacom.natv.services.impl;

import kg.megacom.natv.dao.DiscountRep;
import kg.megacom.natv.models.entities.Discount;
import kg.megacom.natv.services.DiscountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiscountServiceImpl implements DiscountService {

    @Autowired
    private DiscountRep rep;
    @Override
    public Discount save(Discount discount) {
        return rep.save(discount);
    }

    @Override
    public Discount findById(long id) {
        return rep.findById(id).orElseThrow(()-> new RuntimeException("Discount не найден"));
    }

    @Override
    public void delete(long id) {

    }

    @Override
    public List<Discount> findAll() {
        return rep.findAll();
    }

    @Override
    public Discount update(long id, Discount discount) {
        return null;
    }
}
