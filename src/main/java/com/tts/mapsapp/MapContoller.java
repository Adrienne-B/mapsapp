package com.tts.mapsapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MapContoller {
	
	@Autowired
	MapService mapService;
	
	
	@GetMapping({"/", "/home"})
	public String getDefaultMap(@ModelAttribute Location location, Model model) {
		model.addAttribute("location", location);
		return "index";
	}
	
	@PostMapping({"/", "/home"})
	public String getMapForLocation(Location location, Model model) {
		mapService.addCoordinates(location);
		System.out.println("+++++++++++++++++++++++++++++++");
		model.addAttribute(location);
		return "index";
	}
	
//	@PostMapping({"/", "/home"})
//	public String getMapForLocation(Model model) {
//		Location location = new Location();
//		mapService.addCoordinates(location);
//		System.out.println("+++++++++++++++++++++++++++++++");
//		model.addAttribute("location", location);
//		return "index";
//	}

}
