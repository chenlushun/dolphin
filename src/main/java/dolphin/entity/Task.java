package dolphin.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author Alex
 **/
@Data
public class Task {

    private Long id;

    private String name;

    private String description;

    /**
     * 脚本ID
     */
    private Long scriptId;

    /**
     * 定时任务
     */
    private String scheduled;

    /**
     * 操作人
     */
    private Long operatorId;

    /**
     * 创建时间
     */
    private Date createAt;

    /**
     * 修改时间
     */
    private Date updateAt;


}
