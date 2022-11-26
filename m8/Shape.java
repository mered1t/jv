public abstract class Shape implements Outable{
    @Override
    public void outputClassName() {
        System.out.println("This is " + this.getClass());
    }
}
