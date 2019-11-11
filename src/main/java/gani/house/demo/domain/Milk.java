package gani.house.demo.domain;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;


@Entity
@Getter
@Setter
public class Milk {
    @Id
    @GeneratedValue
    private Integer id;
    private Date date;
    private Integer noOfPockets;
}
