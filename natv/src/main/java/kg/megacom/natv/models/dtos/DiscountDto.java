package kg.megacom.natv.models.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class DiscountDto {

    @JsonProperty("id")
    Long id;
    @JsonProperty("from_days_count")
    int fromDaysCount;
    @JsonProperty("discount")
    int discount;


}
