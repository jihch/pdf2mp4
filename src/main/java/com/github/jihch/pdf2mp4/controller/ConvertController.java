package com.github.jihch.pdf2mp4.controller;

import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 
 * @author 姬鸿昌
 * 2019年12月15日
 */
@Controller("/convert")
public class ConvertController {

	@GetMapping("/files/{filename:.+}")
	@ResponseBody
	public String listUploadedFiles(@PathVariable String filename, Model model) throws IOException {
		System.out.println();
		return "";
	}
	
}
