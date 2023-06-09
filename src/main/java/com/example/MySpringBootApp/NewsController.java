package com.example.MySpringBootApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/news")
public class NewsController {
	
	@GetMapping("/headline")
	@ResponseBody
	public String getLatestedBusinessNewsHeadline() {
		return "Dow Jones Stumbles As Fed Governors Assess Inflation, Looming Debt Default, Credit Crunch; "
				+ "AI Play Surges On Earnings | Investor's Business Daily - Investor's Business Daily";
	}

}
