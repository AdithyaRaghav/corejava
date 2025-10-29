package day21.userdefinedannotation;

public class AndroidSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SmartTV(os = "android", height = 40, width = 50)
		@SmartPhone()
		class AndroidSeries {
			String model;
			int screenSize;

			public AndroidSeries(String model, int screenSize) {
				this.model = model;
				this.screenSize = screenSize;
			}
		}
	}

}
