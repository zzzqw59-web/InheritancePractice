package exam_generic_type;

public class PencilCase {
    private String brand;
    private String kind;

    public PencilCase(String brand, String kind) {
        this.brand = brand;
        this.kind = kind;
    }

    @Override
    public String toString() {
        return "pencilCase [brand = " + brand + ", kind = " + kind + "]";
    }
}
