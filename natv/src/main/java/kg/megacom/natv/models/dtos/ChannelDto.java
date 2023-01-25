package kg.megacom.natv.models.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class ChannelDto {

    @JsonProperty("id")
    Long id;
    @JsonProperty("name")
    String name;
    @JsonProperty("price_per_letter")
    int pricePerLetter;
    @JsonProperty("discounts")
    List<DiscountDto> discountDto;
}
