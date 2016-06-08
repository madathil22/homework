package com.gransara.gemstore.contollers;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gransara.gemstore.model.ProductVO;
import com.gransara.gemstore.model.ReviewVO;

/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping("/products")
public class ProductController {
	
	private static final Logger logger = LoggerFactory.getLogger(ProductController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/getProducts", method = RequestMethod.GET)
	public @ResponseBody List<ProductVO> getProducts() {
		List<ProductVO> retlist=new ArrayList<ProductVO>();
		ProductVO pr=new ProductVO();
		pr.setBuyable(true);
		pr.setDesc("A miracle of nature");
		pr.setColor("white");
		pr.setName("Diamond");
		pr.setPrice(30000);
		pr.setReviews(new ArrayList<ReviewVO>());
		ReviewVO rw=new ReviewVO();
		rw.setUser("tobin");
		rw.setComment("Niceee");
		rw.setRating(5);
		pr.getReviews().add(rw);
		retlist.add(pr);
		return retlist;
	}
	
}
