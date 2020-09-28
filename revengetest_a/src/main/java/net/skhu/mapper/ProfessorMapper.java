package net.skhu.mapper;

import net.skhu.dto.Professor;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProfessorMapper {
    List<Professor> findAll();
    Professor findOne(int id);
    List<Professor> findByDepartment(int id);
}
