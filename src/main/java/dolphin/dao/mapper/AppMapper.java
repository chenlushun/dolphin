package dolphin.dao.mapper;

import dolphin.entity.App;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author Alex
 **/
public interface AppMapper {
    void save(App app);

    void delete(Long id);

    @Select("SELECT  * from project_info ")
    @ResultMap("app")
    List<App> findAll();

    void update(App app);

    @Select("SELECT  * from project_info where project_name=#{name} ")
    @ResultMap("app")
    App findByName(@Param("name") String name);
}
