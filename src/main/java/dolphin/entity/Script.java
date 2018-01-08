package dolphin.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author Alex
 **/
@Data
public class Script {

    private Long id;

    private String name;

    private Long parentId;

    private String file;

    private String description;

    /**
     * @see Status
     */
    private Integer status;

    /**
     * @see Type
     */
    private Integer type;

    private Long operatorId;

    private Date createAt;

    private Date updateAt;


    public enum Status {
        DELETE(0, "删除"),
        EXPIRE(1, "过期"),
        LATEST(2, "最新");

        private int value;
        private String name;

        Status(int value, String name) {
            this.value = value;
            this.name = name;
        }

        public static String getName(Integer value) {
            for (Status status : Status.values()) {
                if (status.getValue() == value) {
                    return status.getName();
                }
            }

            return null;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public enum Type {
        SHELL(0, "shell"),
        PYTHON(1, "python");

        private int value;
        private String name;

        Type(int value, String name) {
            this.value = value;
            this.name = name;
        }

        public static String getName(Integer value) {
            for (Type type : Type.values()) {
                if (type.getValue() == value) {
                    return type.getName();
                }
            }

            return null;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
