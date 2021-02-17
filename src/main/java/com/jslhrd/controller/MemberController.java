package com.jslhrd.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/Member/")
public class MemberController {
	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);

	@GetMapping("index")
	public String index() {
		logger.info("index......");
		return "/Contents/index";
	}

	@GetMapping("login")
	public String MemberLogin() {
		logger.info("memberLogin....");
		return "/Contents/Member/login";
	}

	@GetMapping("confirm")
	public String MemberConfrim() {
		logger.info("memberConfirm..");
		return "/Contents/Member/confirm";
	}

	@GetMapping("member_id_check")
	public String memberIdCheck(@RequestParam("id") String id, Model model) {
		
		return "/Contents/Member/Member_id_check";
	}

	@PostMapping("member_id_check")
	public String memberIdCheck2(@RequestParam("id") String id, Model model) {
		
		return "/Contents/Member/Member_id_check";
	}

	@GetMapping("member_write")
	public String MemberWrite() {
		logger.info("member_write");
		return "/Contents/Member/signup";
	}

	@PostMapping("member_write")
	public String MemberwritePro(Model model) {
		logger.info("WritePro...");

		
			return "redirect:/Contents/Member/login";
		

	}

	@GetMapping("member_email")
	public String memberEmail(@RequestParam("email") String email, Model model) {
		
		return "/Contents/Member/Member_email";
	}

	@PostMapping("loginPro")
	public String MemberLoginPro(Model model, HttpServletRequest request, HttpServletResponse response) {

		
			return "Contents/Member/login";
		
	}

	@GetMapping("logout")
	public String MemberLogout(HttpServletRequest request) {
		HttpSession session = request.getSession();
		session.invalidate();

		return "redirect:/index";

	}

	@GetMapping("id_search")
	public String IdSearch() {
		logger.info("memberIdsearch....");

		return "/Contents/Member/Member_id_search";
	}

	@PostMapping("id_search")
	public String memberIdSearch(@RequestParam("name") String name, Model model) {
		
		return "/Contents/Member/Member_id_search";
	}

	@GetMapping("pass_search")
	public String passSearch() {
		logger.info("memberpasssearch....");

		return "/Contents/Member/Member_pass_search";
	}

	@PostMapping("pass_search")
	public String memberpassSearch(@RequestParam("id") String id, @RequestParam("email") String email,
			Model model) {
		
		return "/Contents/Member/Member_pass_search";
	}
//사업자 

	

	@GetMapping("business_email")
	public String businessEmail(@RequestParam("b_email") String b_email, Model model) {
	
		return "/Contents/Member/Member_email";
	}

	@GetMapping("business_write")
	public String businessWrite() {
		logger.info("business_write");
		return "/Contents/Member/signup";
	}

	@PostMapping("business_write")
	public String businesswritePro(@RequestParam("id") String id ,Model model) {
		logger.info("WritePro...");
		return "redirect:/Contents/Member/login";
		

	}
	@PostMapping("businessloginPro")
	public String businessLoginPro(Model model, HttpServletRequest request, HttpServletResponse response) {

		
			return "Contents/Member/login";
		
	}
	@GetMapping("memberBM")
	public String memberBM(Model model, HttpServletRequest request, HttpServletResponse response) {
		
		
		
	return "Contents/Member/memberBM";
}
	@PostMapping("memberBM")
	public String memberBMPro(Model model, HttpServletRequest request, HttpServletResponse response) {
		
		
	  				return "/Contents/Member/memberBM";
	  			
			
		
	}
	

	@GetMapping("memberView")
	public String memberView(Model model, HttpServletRequest request, HttpServletResponse response) {
		
		
	return "Contents/Member/memberView";
}
	@PostMapping("memberView")
	public String memberViewPro(Model model, HttpServletRequest request, HttpServletResponse response) {
		
		
	return "redirect:/index";
}	
	@GetMapping("b_id_search")
	public String b_IdSearch() {
		logger.info("busiIdsearch....");

		return "/Contents/Member/business_id_search";
	}

	@PostMapping("b_id_search")
	public String businessIdSearch(@RequestParam("b_name") String b_name, Model model) {
		
		return "/Contents/Member/business_id_search";
	}

	@GetMapping("b_pass_search")
	public String b_passSearch() {
		logger.info("memberpasssearch....");

		return "/Contents/Member/business_pass_search";
	}

	@PostMapping("b_pass_search")
	public String b_passSearch(@RequestParam("b_id") String b_id, @RequestParam("b_email") String b_email,
			Model model) {
		
		return "/Contents/Member/business_pass_search";
	}
	@GetMapping("admin")
	public String MemberAdmin(Model model) {
		logger.info("memberAdmin....");
		
		return "/Contents/Member/Member_admin";
	}
	@GetMapping("delete")
	public String MemberDelete() {
		logger.info("memberDelete....");
		
		return "/Contents/Member/member_delete";
	}
	@GetMapping("b_delete")
	public String businessDelete() {
		logger.info("memberDelete....");
		
		return "/Contents/Member/business_delete";
	}
	@PostMapping("delete")
	public String memberDeletePro(Model model, HttpServletRequest request, HttpServletResponse response) {
		
		
	return "redirect:/index";
}	
	@GetMapping("member_list")
	public String MemberList(Model model) {
		logger.info("memberAdmin....");
		
		return "/Contents/Member/Member_list";
	}
	@GetMapping("business_list")
	public String businessList(Model model) {
		logger.info("memberAdmin....");
		
		return "/Contents/Member/Business_list";
	}
	@GetMapping("admin_list")
	public String adminList(Model model) {
		logger.info("memberAdmin....");
		
		return "/Contents/Member/Admin_list";
	}
	@GetMapping("product_list")
	public String productList(Model model) {
		logger.info("proAdmin....");
		
		return "/Contents/Member/product_list";
	}
	@GetMapping("unregit_list")
	public String unregitList(Model model) {
		logger.info("unregit....");
		
		return "/Contents/Member/unregit_list";
	}
	@GetMapping("slist")
	public String sList(Model model, HttpServletRequest request) {
		logger.info("shopping....");
		
		return "/Contents/Member/Member_slist";
	}
}