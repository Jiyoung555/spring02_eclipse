package com.myproject.myapp.service;
import java.util.List;

import com.myproject.myapp.domain.BoardVO;

//서비스 인터페이스 //컨트롤러에서 요청될 service 메소드
public interface BoardService {
	
	  public void regist(BoardVO board) throws Exception;

	  public BoardVO read(Integer bno) throws Exception;

	  public void modify(BoardVO board) throws Exception;

	  public void remove(Integer bno) throws Exception;

	  public List<BoardVO> listAll() throws Exception;
}
