package dolphin.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Alex
 **/
@Data
public class Site implements Serializable{

    private Long id;
    private String url;
    private String name;


    /**
     * 0,删除，1正常
     */
    private Integer isDelete;

    private Date createAt;
    private Date updateAt;

}
