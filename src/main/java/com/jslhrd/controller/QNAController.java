package com.jslhrd.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


@Controller
@RequestMapping("/Q&A/")
public class QNAController {
	private static final Logger log = 
			LoggerFactory.getLogger(QNAController.class);
	
	
	@GetMapping("board_qna")
	public String boardList(@RequestParam("page") int page,Model model) {
		
		
		return "/Contents/Board/Q&A/board_qna";
	}
	
	@PostMapping("board_qna")
	public String boardListSearch(@RequestParam("page") int page,Model model) {
		
		
		return "/Contents/Board/Q&A/board_qna";
	}
	
	@GetMapping("board_view_cnt")
	public String boardReadCnt(@RequestParam("idx") int q_idx,HttpServletRequest request,HttpServletResponse response,@RequestParam("page") int page,Model model) {
		
		return "redirect:board_qna_view?idx="+q_idx;
	}
	
	@GetMapping("board_qna_view")
	public String boardView(@RequestParam("idx") int idx,Model model,@RequestParam("page") int page) {
		
		return "redirect:/Q&A/board_qna_write_pro?page="+page;
		}
		
		@GetMapping("board_qna_write_pro")
		public String board_qna_write_pro(@RequestParam("page") int page,Model model) {
			log.info("boardWrite_pro()..............");
			
			return "/Contents/Board/Q&A/board_qna_write_pro";
		}
		
		@GetMapping("board_qna_reply")
		public String board_qna_reply(@RequestParam("idx") int idx,@RequestParam("page") int page,Model model) {
			log.info("boardReply()....");
			
			
			return "/Contents/Board/Q&A/board_qna_reply";
		}
		
		
		
		@GetMapping("board_qna_modify")
		public String boardModify(@RequestParam("idx") int idx,Model model,@RequestParam("page") int page) {
			
			return "/Contents/Board/Q&A/board_qna_modify";
		}
		
		
		@PostMapping("board_qna_modify")
		public String boardModifyPro(RedirectAttributes rttr,@RequestParam("page") int page,@RequestParam("idx") int idx) {
					log.info("Controller : boardModifyPro()....");
					
					return "redirect:/Q&A/board_qna_modify_pro?page="+page;

				}
		
		
				@GetMapping("board_qna_modify_pro")
				public String board_qna_modify_pro(@RequestParam("page") int page,Model model) {
					log.info("board_qna_modify_pro()..............");
					model.addAttribute("page",page);
					return "/Contents/Board/Q&A/board_qna_modify_pro";
				}
				
				@GetMapping("board_qna_delete")
				public String board_qna_delete(@ModelAttribute("q_idx") int q_idx) {
					log.info("board_qna_delete()...");
					return "Contents/Board/Q&A/board_qna_delete";
				}
				@PostMapping("board_qna_delete_pro")
				public String board_qna_delete_pro( Model model) {
					log.info("board_qna_delete_pro()...");
					int row = 0;
					
					model.addAttribute("row",row);
					return "Contents/Board/Q&A/board_qna_delete_pro";
				}	
				
}
