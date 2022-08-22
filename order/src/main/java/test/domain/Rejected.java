package test.domain;

import test.domain.*;
import test.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class Rejected extends AbstractEvent {

    private Long id;
    private Long productId;
    private Integer qty;
    private String productName;
    private String orderStatus;

    public Rejected(Order aggregate){
        super(aggregate);
    }
    public Rejected(){
        super();
    }
    // keep

}
