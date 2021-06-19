package com.getingfamiliar;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class DojoController {
@RequestMapping("/{track}")
public String dojo(@PathVariable("track") String track)
{
	if(track.equals("dojo"))
	{
		return " The "+track+" is awesome";
	}
	else if(track.equals("coding-dojo")) {
		
		return "Coding Dojo is located in Southern California";
	}else if(track.equals("san-jose"))
	{
		return 	" SJ dojo is the headquarters";
	}
	else return "hello";
}
}
