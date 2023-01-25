package kg.megacom.natv.models.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "discounts")
public class Discount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    int fromDaysCount;
    int discount;
    @JsonFormat(pattern = "dd.mm.yyyy")
    @DateTimeFormat(pattern = "dd.mm.yyyy")
    Date startDate;
    @JsonFormat(pattern = "dd.mm.yyyy")
    @DateTimeFormat(pattern = "dd.mm.yyyy")
    Date endDate;
    @ManyToOne
    @JoinColumn(name = "channel_id")
    Channel channel;
}
