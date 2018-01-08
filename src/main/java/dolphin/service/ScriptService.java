package dolphin.service;

import dolphin.entity.Script;

import java.util.List;

public interface ScriptService {

    List<Script> findAll();

    void save(Script script);

    /**
     * @param id id
     * @return 脚本对象
     */
    Script findById(Long id);

    /**
     * 查询历史脚本
     *
     * @param id id
     * @return 脚本
     */
    Script findHisTory(Long id);

    /**
     * 更新一个脚本：
     * 1、将已有的脚本设置为已过期
     * 2、新加入一条脚本数据，状态为最新，parentId为上一个脚本的id，状态为最新
     *
     * @param script 脚本
     */
    void update(Script script);


}
