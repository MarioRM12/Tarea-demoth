package org.iesvdm.controlador;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import jakarta.servlet.http.HttpSession;
import org.iesvdm.modelo.Libro;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoTHController {

	@GetMapping("/demoth1")
	public String demoTH(Model model) {
		
		String textoParrafo2 = "Esto es el texto que irá dentro del párrafo...";
		model.addAttribute("parrafo2", textoParrafo2);
		
		
		List<String> books = new ArrayList<>();
		books.add("El Quijote");
		books.add("Crimen y Castigo");
		books.add("Oliver Twist");

		model.addAttribute(books); //Equivalente a model.addAttribute("books", books)

		List<String> listUsers = Arrays.asList("Paco González", "Pepe Domingo Castaño", "Manolo Lama");
		model.addAttribute("users", listUsers);
		
		return "demoth1";
	}

	@GetMapping("/demoth2")
	public String demoth2(Model model) {

		List<Libro> libros = new ArrayList<>();

		libros.add(new Libro("El Quijote", "Miguel Cervantes", "Anaya"));
		libros.add(new Libro("Crimen y Castigo", "Fedor Dostoievski", "Santillana"));
		libros.add(new Libro("Oliver Twist", "Charles Dickens", "Tusquests"));

		model.addAttribute(libros); //Equivalente a model.addAttribute("libroList", books)

		return "demoth2";
	}

	@GetMapping("/demoth3")
	public String demoth3(Model model, HttpSession session) {

		String variable = "Hola, mundo!";

		model.addAttribute("unaVariable", variable);

		String variableSesion = "Esto es una variable de sesión...";

		session.setAttribute("unaVariableDeSesion", variableSesion);

		Libro libro = new Libro("El Quijote", "Miguel Cervantes", "Anaya");
		session.setAttribute("ElQuijote", libro);

		return "demoth3";
	}

	@GetMapping("/demoth4")
	public String demoth4(Model model) {

		Libro libro = new Libro("El Quijote", "Miguel Cervantes", "Anaya");

		model.addAttribute("libro", libro);

		return "demoth4";
	}

	@GetMapping("/demoth5")
	public String demoth5(Model model) {

		Libro libro = new Libro("El Quijote", "Miguel Cervantes", "Anaya");

		model.addAttribute("libro", libro);

		return "demoth5";
	}
	
}
