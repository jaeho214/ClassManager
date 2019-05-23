package com.dev.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TimeTableController {

	@GetMapping("/timetable")
	public String makeTimeTable() {
		return "timetable";
	}
}
