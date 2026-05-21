package exam_multi_type_parameter;

public class ProductExample {
    static void main(String[] args) {
        Product<Car, String> product1 = new Product<>(new Car("RED"), "베뉴");
        System.out.println(product1.toString() + " [color: " +  product1.getKind().getColor() + "]");

        Product<TV, String> product2 = new Product<>(new TV(30), "LG 그램");
        System.out.println(product2.toString() + " [size: " + product2.getKind().getSize() + "]");

        Product<SmartPhone, String> product3 = new Product<>(new SmartPhone("삼성", "갤럭시"), "S25");
        System.out.println(product3.toString() + " [model: " + product3.getKind().getOS()+ "]");
    }
}
