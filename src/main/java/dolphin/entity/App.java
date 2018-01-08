package dolphin.entity;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Alex
 **/
@Data
@Builder
public class App {

    //private Long id;

    private String projectName;

    private String projectEnv;

    private String projectAppPort;

    private String projectManagementPort;

    private String projectLogsPath;

    private String projectDeployHost;

    private String projectDeployPath;

    private String projectStartCmd;

    private String sourceJarPath;

    private String sourceJarName;

    private Integer startSeq;

    public enum ProjectEnv {
        DEVELOP(0, "开发环境"),
        TEST(1, "测试环境"),
        PRE_PRODUCE(2, "预生产环境"),
        PRODUCE(3, "生产环境");

        private int value;
        private String name;

        ProjectEnv(int value, String name) {
            this.value = value;
            this.name = name;
        }

        public static String getName(Integer value) {
            for (ProjectEnv commentState : ProjectEnv.values()) {
                if (commentState.getValue() == value) {
                    return commentState.getName();
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
