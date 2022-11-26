public abstract class Shape implements Outable{
    @Override
    public void outputClassName() { // метод виводу назви об'єкту
        String output = new String();
        output = String.valueOf(this.getClass()).replace("class", "");
        System.out.println("This is" + output);
    }
}
