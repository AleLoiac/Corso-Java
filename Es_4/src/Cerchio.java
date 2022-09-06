public class Cerchio {

    public Cerchio(int raggio) {
        this.raggio = raggio;
    }

    private int raggio;

    public double getCirconferenza() {
        return 2 * raggio * Math.PI;
    }

    public double getArea() {
        return (Math.pow(raggio, 2)) * Math.PI;
    }

}
