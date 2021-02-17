package com.jslhrd.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/Notice/")
public class NoticeController {
	private static final Logger log = 
			LoggerFactory.getLogger(NoticeController.class);
	
	
	
	@GetMapping("board_notice_view")
	public String noticeSelect(@RequestParam("idx") int idx,@RequestParam("page") int page,Model model) {
		log.info("notice_view()..............");
		
		return "/Contents/Board/Notice/board_notice_view";
	}
	
	
		@GetMapping("notice")
		public String notice(@RequestParam("page") int page,Model model) {
			
			return "/Contents/Board/Notice/notice";
		}
		
			@PostMapping("notice")
			public String noticeListSearch(@RequestParam("page") int page, Model model) {
				log.info("noticeListSearch()..............");
			String url = "notice";
				
				
				return "/Contents/Board/Notice/notice";
			}
	
			@GetMapping("board_write")
			public String notice_Write(@RequestParam("page") int page,Model model) {
				log.info("board_write()..............");
				
					return "redirect:/Notice/board_notice_modify_pro?page="+page;
				}
				
			
				@GetMapping("board_notice_modify_pro")
				public String board_notice_modify_pro(@RequestParam("page") int page,Model model) {
					log.info("board_notice_modify_pro()..............");
					model.addAttribute("page",page);
					return "/Contents/Board/Notice/board_notice_modify_pro";
				}
				
				@GetMapping("board_notice_delete")
				public String boardDelete(@ModelAttribute("idx") int idx) {
					log.info("boardDelete()...");
					return "Contents/Board/Notice/board_notice_delete";
				}
				@PostMapping("board_notice_delete_pro")
				public String boardDeletePro( Model model) {
					log.info("boardDelete()...");
					
					return "Contents/Board/Notice/board_notice_delete_pro";
				}
				
}
