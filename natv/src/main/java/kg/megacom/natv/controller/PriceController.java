package kg.megacom.natv.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import kg.megacom.natv.models.entities.Channel;
import kg.megacom.natv.models.entities.Price;
import kg.megacom.natv.services.ChannelService;
import kg.megacom.natv.services.PriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(tags = "Стоимость")
@RestController
@RequestMapping("/api/v1/price")
public class PriceController {

    @Autowired
    private PriceService service;

    @PostMapping("/save")
    @ApiOperation("Сохранение")
    Price save(@RequestBody Price price){return service.save(price);}

    @GetMapping("/findById")
    @ApiOperation("Поиск канала по ID")
    Price findById(@RequestParam Long id){return service.findById(id);}

    @GetMapping("/findAll")
    @ApiOperation("Вывод всех каналов")
    List<Price> findAll(){return service.findAll();}
}
