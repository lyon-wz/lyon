package lyon.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SysDict {

    private Integer id;

    private  String name;

    private  Integer type;
}
