package com.myproject.myapp.service;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.myproject.myapp.domain.BoardVO;
import com.myproject.myapp.persistence.BoardDAO;


//Service 인퍼페이스를 구현한 클래스
//이게 왜 편함? ImplA만 말고, ImplB, ImplC ... 여러개 만들어서 상황 맞게 사용 가능
@Service
public class BoardServiceImpl  implements BoardService {

	@Inject //spring에서의 @Autowired 비슷 (구글링)
	private BoardDAO dao;

	@Override
	public void regist(BoardVO board) throws Exception {
		dao.create(board);
	}

	@Override
	public BoardVO read(Integer bno) throws Exception {
		return dao.read(bno);
	}

	@Override
	public void modify(BoardVO board) throws Exception {
		dao.update(board);
	}

	@Override
	public void remove(Integer bno) throws Exception {
		dao.delete(bno);
	}

	@Override
	public List<BoardVO> listAll() throws Exception {
		return dao.listAll();
	}

}
