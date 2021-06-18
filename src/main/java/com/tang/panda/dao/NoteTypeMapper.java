package com.tang.panda.dao;


import com.tang.panda.pojo.NoteType;

public interface NoteTypeMapper {
    int deleteByPrimaryKey(Long ntypeid);

    int insert(NoteType record);

    int insertSelective(NoteType record);

    NoteType selectByPrimaryKey(Long ntypeid);

    int updateByPrimaryKeySelective(NoteType record);

    int updateByPrimaryKey(NoteType record);
}