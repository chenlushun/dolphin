package dolphin.dao;

import dolphin.entity.Script;

import java.util.List;

public interface ScriptRepository {

    List<Script> findAll();

    void save(Script script);

    Script findById(Long id);

    void update(Script script);

    /**
     * 设置脚本过期
     *
     * @param id id
     */
    void expire(Long id);

    Script findHisTory(Long id);
}
