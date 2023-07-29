public class Task1 {
    public static void main(String[] args) {
        printElement<Integer> iob = new printElement(1);
        iob.showType();
        int i = (Integer)iob.getOb();
        System.out.println("Значение iob " + i);
        printElement<String> sob = new printElement("Привет");
        sob.showType();
        String s = (String)sob.getOb();
        System.out.println("Значение sob " + s);
        printElement<Double> dob = new printElement(1.0);
        dob.showType();
        double d = (Double)dob.getOb();
        System.out.println("Значение dob " + d);
    }
}
class printElement<T> {

    T ob;

    public printElement(T o) {
        ob = o;
    }

    public T getOb() {
        return ob;
    }

    public void showType() {
        System.out.println("Тип объекта " + ob.getClass().getName());
    }
}
