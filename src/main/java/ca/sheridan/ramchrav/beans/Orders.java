package ca.sheridan.ramchrav.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Orders implements Serializable {
    private int quantity;
    private String size;
    private String coffeeType;

    private String[] sizes = {"Small", "Medium", "Large"};
}
