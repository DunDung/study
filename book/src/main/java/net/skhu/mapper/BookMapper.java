package net.skhu.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import net.skhu.dto.Book;


@Mapper
public interface BookMapper {

	Book findOne(int id);
	Book findByTitle(String title);
	List<Book> findAll();
	void insert(Book book);
	void update(Book book);
	void delete(int id);

}
