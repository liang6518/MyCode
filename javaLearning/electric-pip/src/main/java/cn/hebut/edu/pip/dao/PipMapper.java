package cn.hebut.edu.pip.dao;

import java.util.List;

public interface PipMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Pip record);

    int insertSelective(Pip record);

    Pip selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Pip record);

    int updateByPrimaryKey(Pip record);

    List<Pip> queryPoint();

}