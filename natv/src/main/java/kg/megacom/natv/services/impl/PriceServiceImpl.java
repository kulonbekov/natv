package kg.megacom.natv.services.impl;

import kg.megacom.natv.dao.PriceRep;
import kg.megacom.natv.models.entities.Price;
import kg.megacom.natv.services.PriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PriceServiceImpl implements PriceService {
    @Autowired
    private PriceRep rep;

    @Override
    public Price save(Price price) {
        return rep.save(price);
    }

    @Override
    public Price findById(long id) {
        return rep.findById(id).orElseThrow(()-> new RuntimeException("Price не найден"));
    }

    @Override
    public void delete(long id) {

    }

    @Override
    public List<Price> findAll() {
        return rep.findAll();
    }

    @Override
    public Price update(long id, Price price) {
        return null;
    }
}
