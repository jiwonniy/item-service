package hello.itemservice.domain.item;

import lombok.Data;

//@Getter @Setter //@Data는 주의해야함. dto같은데서는 써도 괜찮긴함.
@Data
public class Item {

    private Long id;
    private String itemName;
    private Integer price;
    private Integer quantity; //수량이 null로 들어갈 가능성도 있음

    public Item(){

    }

    public Item(String itemName, Integer price, Integer quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
}
