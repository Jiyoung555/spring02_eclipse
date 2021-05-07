package com.myproject.myapp.persistence;
import java.util.List;

import com.myproject.myapp.domain.BoardVO;

//인터페이스
public interface BoardDAO {
	
	public void create(BoardVO vo) throws Exception;

	public BoardVO read(Integer bno) throws Exception;

	public void update(BoardVO vo) throws Exception;

	public void delete(Integer bno) throws Exception;

	public List<BoardVO> listAll() throws Exception; //List는 util
}
