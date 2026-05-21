package exam_generic_type;

public class Notebook {
    private String make;
    private String size;

    public Notebook(String make, String size) {
        this.make = make;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Notebook [make = " + make + ", size = " + size + "]";
    }
}
