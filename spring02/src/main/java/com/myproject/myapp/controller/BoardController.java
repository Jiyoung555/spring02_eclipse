package com.myproject.myapp.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.myproject.myapp.domain.BoardVO;
import com.myproject.myapp.service.BoardService;

@Controller
@RequestMapping(value = "/") // 주소 패턴 //servers 더블클릭, 기본주소값 /로 변경함
public class BoardController {

	@Inject //주입(심부름꾼) 명시
	private BoardService service; //Service 호출을 위한 객체생성
	
	//주소 호출 명시. 호출하려는 주소와 REST 방식 설정 (GET)
	@RequestMapping(value= "/listAll", method = RequestMethod.GET) 
	public void listAll(Model model)throws Exception { //메소드 인자값은 model 인터페이스(jsp 전달 심부름꾼)
		model.addAttribute("list", service.listAll()); 
		//jsp에 심부름할 내역(서비스 호출)
		//return할 뷰페이지를 직접 적지 않아도, url과 동일한 jsp 파일을 자동 리턴함
		//직접 명시해줘도 됨 return "views/listAll.jsp"; //리턴타입 void->String 수정
	}
	
	//---------------------------------------------------
	
	//GET 방식으로 페이지 호출
	@RequestMapping(value = "/regist", method = RequestMethod.GET) 
	public void registerGET(BoardVO board, Model model) throws Exception {}

	//POST방식으로 내용 전송
	@RequestMapping(value = "/regist", method = RequestMethod.POST) 
	public String registPOST(BoardVO board, RedirectAttributes rttr) throws Exception { 
		//RedirectAttributes: redirect로 이동시에 model처럼 값 가져갈 수 있음 //현재 사용 x
		service.regist(board); //글 작성 서비스 호출
	    return "redirect:/listAll"; //작성이 완료된 후, 목록페이지로 리턴
	}
	
	//---------------------------------------------------	
	//GET 방식으로 페이지 호출
	@RequestMapping(value = "/read", method = RequestMethod.GET) 
	public void read(@RequestParam("bno") int bno, Model model) throws Exception {
		//글번호 bno를 기준으로 Model을 사용하여 불러옴
		model.addAttribute(service.read(bno)); //read 서비스 호출
	}
	
	//---------------------------------------------------	
	
	//GET 방식으로 페이지 호출
	@RequestMapping(value = "/modify", method = RequestMethod.GET) 
	public void modifyGET(int bno, Model model) throws Exception {
		model.addAttribute(service.read(bno)); // 수정을 위한 글읽기 서비스 호출
	}

	//POST방식으로 데이터 전송
	@RequestMapping(value = "/modify", method = RequestMethod.POST)
	public String modifyPOST(BoardVO board, RedirectAttributes rttr) throws Exception {
		service.modify(board); //글수정 서비스 호출
		return "redirect:/listAll"; //수정이 완료된 후, 목록페이지로 리턴
	}
	
	//---------------------------------------------------	
	
	//POST방식으로 데이터 전송
	@RequestMapping(value = "/remove", method = RequestMethod.POST)
	public String removePOST(@RequestParam("bno") int bno, RedirectAttributes rttr) throws Exception{
		service.remove(bno); //글삭제 서비스 호출
		return "redirect:/listAll"; //삭제가 완료된 후, 목록페이지로 리턴
	}
	
}
