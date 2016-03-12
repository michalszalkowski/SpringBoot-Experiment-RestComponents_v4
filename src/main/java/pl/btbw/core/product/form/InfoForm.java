package pl.btbw.core.product.form;

import pl.btbw.core.common.input.Form;
import pl.btbw.core.product.core.Product;

public class InfoForm implements Form {

	private String name;

	public InfoForm(String name) {
		this.name = name;
	}

	@Override
	public void update(Object updatable) {
		Product product = (Product) updatable;
		product.setName(name);
	}
}
