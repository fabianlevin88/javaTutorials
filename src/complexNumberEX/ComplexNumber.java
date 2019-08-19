package complexNumberEX;

public class ComplexNumber {

    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void add(double real, double imaginary) {
		this.real += real;
		this.imaginary += imaginary;
	}
	public void add(ComplexNumber complex) {
		add(complex.getReal(), complex.getImaginary()); // calling the add method to do the math

	}
	public void subtract(double real, double imaginary) {
		this.real -= real;
		this.imaginary -= imaginary;
	}
	public void subtract(ComplexNumber complex) {
		subtract(complex.getReal(), complex.getImaginary()); // calling the subtract method to do the math
	}
}
