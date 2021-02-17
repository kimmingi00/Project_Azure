package com.jslhrd.controller;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
@RequestMapping("/Reservation/")

public class ReservationController {
	private static final Logger logger = 
			LoggerFactory.getLogger(ReservationController.class);
	
	
	
	@GetMapping("reserv_main")
	public String reserv_main(@RequestParam("place") int place, @RequestParam("outplace") int outplace, @RequestParam("row") int row, Model model) {
		logger.info("reserv_main......");
		
		String table = "";
		
		return "/Contents/Reservation/Reserv_main";
	}
	
	@GetMapping("product_view")
	public String productView( Model model, @RequestParam("id") String id) {
		logger.info("product_view......");
		
		if(id.equals("")) id="^%&^%*^&*^&(^";
		
		
		return "/Contents/Reservation/Reserv_view";
	}
	
	
	
	
	@GetMapping("Product_upload_main")
	public String productUploadMain(Model model) {
		logger.info("productUploadMain......");
		
		
		
		return "/Contents/Reservation/R_Business/upload_main";
	}
	
	@GetMapping("upload_service")
	public String uploadService() {
		logger.info("uploadService......");
		
		return "/Contents/Reservation/R_Business/UploadService/Product_Upload";
	}
	
	
	@PostMapping("upload_service")
	public String uploadServicePro(@RequestParam("b_id") String b_id, Model model, HttpServletRequest request){
		logger.info("uploadServicePro......");
		
		String path = "C:\\Users\\alsrl\\eclipse-workspace\\Spring_Project\\Project_final\\src\\main\\webapp\\resources\\img\\product_img";
		
		String encType = "utf-8";
		
		int sizeLimit = 4*1024*1024; 
		int row = 0;
		/*
		try {
	
			MultipartRequest multi = new MultipartRequest(request, path, sizeLimit, 
					encType, new DefaultFileRenamePolicy());
			
			int cnt = Integer.parseInt(multi.getParameter("cnt"));
			
			String p_title = multi.getParameter("p_title"); 
			
			String p_contents = multi.getParameter("p_contents"); 
			String p_indate = multi.getParameter("p_indate"); 
			String p_outdate = multi.getParameter("p_outdate"); 
			String p_in = multi.getParameter("p_in");
			String p_intime = multi.getParameter("p_intime");
			String p_outtime = multi.getParameter("p_outtime");
			String p_spot = multi.getParameter("p_spot");
			String p_spottime = multi.getParameter("p_spottime");
			String p_stopover = multi.getParameter("p_stopover");
			String p_stoptime = multi.getParameter("p_stoptime");
			int place = Integer.parseInt(multi.getParameter("place"));
			int outplace = Integer.parseInt(multi.getParameter("outplace"));
			
			
			if(cnt>2) {
				String[] in_array = new String[cnt-2];
				String[] time_array = new String[cnt-2];
				for(int i=0; i<cnt-2; i++) {
					in_array[i] = multi.getParameter("p_in"+(i+2));
					time_array[i] = multi.getParameter("p_intime"+(i+2));
					
				}
				for(int i=0; i<in_array.length; i++) {
					p_in = p_in+", "+in_array[i];
					p_intime = p_intime+", "+time_array[i];
				}
			}
			
			
			String p_out = multi.getParameter("p_out"); 
			int p_maxpeople = Integer.parseInt(multi.getParameter("p_maxpeople")); 
			int p_price = Integer.parseInt(multi.getParameter("p_price")); 
			String[] tema = multi.getParameterValues("thema"); 
			String p_filename = multi.getFilesystemName("p_filename"); 
			int fcnt = Integer.parseInt(multi.getParameter("fcnt"));
			
			if(fcnt!=0) {
				String[] file_array = new String[fcnt];
				
				for(int i=0; i<fcnt; i++) {
					file_array[i]=multi.getFilesystemName("p_filename"+(i+1));
				}
				
				for(int i=0; i<file_array.length; i++) {
					p_filename = p_filename+","+file_array[i];
				}
			}
			
			
			String theme="";
			if(tema!=null) {
				for(int i=0; i<tema.length; i++) {
					if(i==tema.length-1) {
						theme=theme+tema[i];
					}else theme=theme+tema[i]+",";
				}
			}
			
			
			ProductVO pvo = new ProductVO();
			
			pvo.setB_id(b_id); pvo.setP_title(p_title); pvo.setP_contents(p_contents);
			pvo.setP_indate(p_indate); pvo.setP_outdate(p_outdate); pvo.setP_in(p_in);
			pvo.setP_out(p_out); pvo.setP_maxpeople(p_maxpeople); pvo.setP_price(p_price);
			pvo.setTheme(theme); pvo.setP_filename(p_filename); 
			
			pvo.setP_intime(p_intime); pvo.setP_outtime(p_outtime); pvo.setP_spot(p_spot);
			pvo.setP_spottime(p_spottime); pvo.setP_stopover(p_stopover); pvo.setP_stoptime(p_stoptime);
			pvo.setPlace(place); pvo.setOutplace(outplace);
			
			
			
			
			row = service.productUpload(pvo);
			
			
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	*/
		model.addAttribute("row", row);
		
		return "/Contents/Reservation/R_Business/upload_ok";

	}
	
	@PostMapping("Reserv_regit")
	public String reservRegit(@RequestParam("p_idx") int p_idx, @RequestParam("reserv_cnt") int reserv_cnt, Model model) {
		logger.info("Reserv_regit......");

	
	

		
		return "/Contents/Reservation/reserv_complete";
	}
	
	@GetMapping("my_upload_product")
	public String myUploadProduct(@RequestParam("b_id") String b_id, Model model) {
		
		logger.info("myUploadProduct......");
		
		
		
		return "/Contents/Reservation/Reserv_main";
	}
	
	@GetMapping("Reserv_modify")
	public String reservModify(@RequestParam("p_idx") int p_idx, @RequestParam("id") String id, Model model) {
		
		logger.info("reserv_modify......");
		
		
		return "/Contents/Reservation/Reserv_modify";
	}
	
	@PostMapping("Reserv_modify")
	public String reservModifyPro(@RequestParam("p_idx") int p_idx, @RequestParam("reserv_cnt") int reserv_cnt, @RequestParam("id") String id, Model model) {
		
		logger.info("reserv_modify_pro......");
		
		
		return "redirect:/index";
	}
	
	@PostMapping("Reserv_ok")
	public String reservOk(@RequestParam("p_idx") int p_idx, @RequestParam("reserv_cnt") int reserv_cnt, Model model) {
		
		logger.info("reserv_ok......");

		
		
		
		
		
		model.addAttribute("p_idx", p_idx);
		model.addAttribute("reserv_cnt", reserv_cnt);
		
		
	
		
		return "/Contents/Reservation/Reserv_ok";
	}
	
	@GetMapping("Reserv_unregit")
	public String reservUnregit(@RequestParam("p_idx") int p_idx, @RequestParam("reserv_cnt") int reserv_cnt, Model model) {
		logger.info("reserv_unregit......");

		
		
		return "/Contents/Reservation/Reserv_unregit";
	}
	
	
	@PostMapping("Reserv_unregit")
	public String reservUnregitPro(@RequestParam("p_idx") int p_idx,@RequestParam("email") String email, @RequestParam("reserv_cnt") int reserv_cnt, Model model) {
		
		logger.info("reserv_unregit_pro......");

		
		return "/Contents/Reservation/Reserv_unregit_ok";
	}
	
	@GetMapping("Unregit_EmailCheck")
	public String unregitEmailCheck(@RequestParam("email") String email, Model model) {
		
		logger.info("unregit_emailcheck......");

		
		
		return "/Contents/Member/Member_email";
	}
	
	@PostMapping("Unregit_login")
	public String unregitLogin(Model model, @RequestParam("p_idx") int p_idx) {
		logger.info("unregit_login......");

		
		
		
		model.addAttribute("p_idx", p_idx);
		
		
	
		
		return "/Contents/Reservation/Reserv_unregitlogin";
	}
	
	@PostMapping("Unregit_login_pro")
	public String unregitLoginPro(@RequestParam("p_idx") int p_idx, @RequestParam("email") String email, Model model) {
		
		logger.info("unregit_login_pro......");
		
		
		
			
			return "/Contents/Reservation/Reserv_unregitmodify";
		
	}
	
	
	
	@PostMapping("Unregit_modify")
	public String unregitModify(Model model, @RequestParam("p_idx") int p_idx, @RequestParam("reserv_cnt") int reserv_cnt, @RequestParam("email") String email) {
		
		logger.info("unregit_modify......");
		
		return "/Contents/Reservation/Reserv_unregit_modify_ok";
	}
	
	
}
