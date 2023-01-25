package kg.megacom.natv.services.serviceDto.impl;

import kg.megacom.natv.models.dtos.ChannelDto;
import kg.megacom.natv.models.entities.Channel;
import kg.megacom.natv.models.entities.Discount;
import kg.megacom.natv.models.entities.Price;
import kg.megacom.natv.models.utils.DateUtil;
import kg.megacom.natv.services.ChannelService;
import kg.megacom.natv.services.DiscountService;
import kg.megacom.natv.services.serviceDto.DtoToEntity;
import kg.megacom.natv.services.PriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class DtoToEntityImpl implements DtoToEntity {

    @Autowired
    private ChannelService channelService;
    @Autowired
    private DiscountService discountService;
    @Autowired
    private PriceService priceService;

    DateUtil dateUtil = DateUtil.getINSTANCE();


    @Override
    public void DtoToEntity(List<ChannelDto> channelDtolist) {

        Channel channel = new Channel();
        Price price = new Price();

        List<Discount> discountList = new ArrayList<>();

        for (int i = 0; i < channelDtolist.size(); i++) {

            channel.setName(channelDtolist.get(i).getName());
            channelService.save(channel);


            price.setPrice(channelDtolist.get(i).getPricePerLetter());
            price.setChannel(channel);
            price.setStartDate(new Date());
            price.setEndDate(dateUtil.getEndDate());
            priceService.save(price);


            for(int j = 0; j< channelDtolist.get(i).getDiscountDto().size(); j++) {

                Discount discount = new Discount();

                discount.setChannel(channel);
                discount.setFromDaysCount(channelDtolist.get(i).getDiscountDto().get(j).getFromDaysCount());
                discount.setStartDate(new Date());
                discount.setEndDate(dateUtil.getEndDate());
                discount.setDiscount(channelDtolist.get(i).getDiscountDto().get(j).getDiscount());
                discountService.save(discount);
                discountList.add(discount);

            }
        }
    }
}
