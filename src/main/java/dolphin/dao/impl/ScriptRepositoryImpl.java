package dolphin.dao.impl;

import dolphin.dao.ScriptRepository;
import dolphin.dao.mapper.ScriptMapper;
import dolphin.entity.Script;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Alex
 **/
@Repository
public class ScriptRepositoryImpl implements ScriptRepository {
    private final ScriptMapper scriptMapper;

    @Autowired
    public ScriptRepositoryImpl(ScriptMapper scriptMapper) {
        this.scriptMapper = scriptMapper;
    }

    public List<Script> findAll() {
        return scriptMapper.findAll();
    }

    public void save(Script script) {
        scriptMapper.save(script);
    }

    public Script findById(Long id) {
        return scriptMapper.findById(id);
    }

    public void update(Script script) {
        scriptMapper.update(script);
    }

    public void expire(Long id) {
        scriptMapper.expire(id);
    }

    public Script findHisTory(Long id) {
        return scriptMapper.findHisTory(id);
    }
}
