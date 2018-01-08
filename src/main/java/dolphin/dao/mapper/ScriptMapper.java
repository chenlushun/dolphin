package dolphin.dao.mapper;

import dolphin.entity.Script;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface ScriptMapper {

    List<Script> findAll();

    @Insert("insert into script(name, description,parent_id, file, operator_id,type,status, create_at, update_at) VALUE" +
            "(#{script.name},#{script.description},#{script.parentId},#{script.file},2,#{script.type},2,now(),now())")
    void save(@Param("script") Script script);

    @Select("select * from script where id=#{id}")
    Script findById(@Param("id") Long id);

    @Update("update script set name=#{script.name},description=#{script.description},file=#{script.file} where id=#{script.id}")
    void update(@Param("script") Script script);

    @Update("update script set status=0 where id=#{id}")
    void delete(@Param("id") Long id);

    /**
     * 过期
     *
     * @param id id
     */
    @Update("update script set status=1,update_at=now() where id=#{id}")
    void expire(@Param("id") Long id);

    @Select("select * from script where id=#{id}")
    Script findHisTory(@Param("id") Long id);

    @Select("select * from script where name=#{name} and status=2 limit 1")
    @ResultMap("script")
    Script findByName(@Param("name") String name);
}
