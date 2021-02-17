package com.jslhrd.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/Message/")
public class MessageController {
	private static final Logger logger = 
			LoggerFactory.getLogger(MessageController.class);
	
	
	
	
	@GetMapping("MessageList")
	public String messageList(@RequestParam("id") String receive_id, Model model) {
		logger.info("MessageList......");
		
		
		
		
		
		
		
		
		
		return "/Contents/Message/Message_main";
	}
	
	@GetMapping("MessageSend")
	public String messageSend() {
		logger.info("MessageSend......");
		
		return "/Contents/Message/Message_send";
	}
	
	@GetMapping("MsgIdSend")
	public String messageIdSend(@RequestParam("id") String id, Model model) {
		logger.info("MessageIdSend......");
		
		model.addAttribute("id", id);
		
		return "/Contents/Message/Message_send";
	}
	
	@PostMapping("MessageSend")
	public String messageSendPro(Model model) {
		logger.info("MessageSendPro......");

		
		
		
		
		return "/Contents/Message/send_ok";
	}
	
	@GetMapping("MsgSendList")
	public String msgSendList(@RequestParam("id") String id, Model model) {
		String send_id = id;
		
		
		return "/Contents/Message/My_Send_Message";
	}
	
	@GetMapping("MsgView")
	public String msgView(@RequestParam("m_idx") int m_idx, Model model) {
		
		
		
		
		return "/Contents/Message/msg_view";
	}
}
