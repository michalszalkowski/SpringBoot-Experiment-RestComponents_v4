package pl.btbw.core.common.input;

public class FormProvider {

	private Object object;

	private FormProvider(Object object) {
		this.object = object;
	}

	public static FormProvider on(Object object) {
		return new FormProvider(object);
	}

	public void update(Form form) {
		form.update(object);
	}
}
