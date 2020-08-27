package io.navadappsMC.menuservice.resources;

import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.navadappsMC.menuservice.models.MenuItem;

@RestController
@RequestMapping("/menu")
public class MenuResource {
	
	@RequestMapping("/{restaurant_id}")
	public List<MenuItem> getMenu(@PathVariable("restaurant_id") String restaurant_id) {
		return Collections.singletonList(
				new MenuItem(1,"Veggie Pullav","Rice mixed with tasty vegetables", 15.99)
		);
		
	}

}
