package com.Lamine.AppliWeb.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping( "/in")
public class MainControler {

@RequestMapping( "/index")
public String index(Model model) {
return "index";
}
}
