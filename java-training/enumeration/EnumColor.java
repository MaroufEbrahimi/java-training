package Enumeration;

public enum EnumColor {
	Black(0, 0, 0),
	White(1, 1, 1), 
	Red(1, 0, 0),
	Yellow(1, 1, 0), 
	Green(0, 1, 0),
	Cyan(0, 1, 1),
	Blue(0, 0, 1),
	Magenta(1, 0, 1);

	private float R, G, B;
	
	EnumColor(float R, float G, float B) {
		this.R = R;
		this.G = G;
		this.B = B;
	}
}
