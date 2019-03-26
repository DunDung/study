package net.skhu.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import net.skhu.dto.Department;
import org.springframework.stereotype.Component;

@Mapper
public interface DepartmentMapper {
    List<Department> findAll();
}

