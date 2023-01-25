package kg.megacom.natv.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import kg.megacom.natv.models.entities.Channel;
import kg.megacom.natv.models.entities.Discount;
import kg.megacom.natv.services.ChannelService;
import kg.megacom.natv.services.DiscountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(tags = "Дисконт")
@RestController
@RequestMapping("/api/v1/discount")
public class DiscountController {

    @Autowired
    private DiscountService service;

    @PostMapping("/save")
    @ApiOperation("Сохранение")
    Discount save(@RequestBody Discount discount){return service.save(discount);}

    @GetMapping("/findById")
    @ApiOperation("Поиск скидки по ID")
    Discount findById(@RequestParam Long id){return service.findById(id);}

    @GetMapping("/findAll")
    @ApiOperation("Вывод всех скидок")
    List<Discount> findAll(){return service.findAll();}
}
