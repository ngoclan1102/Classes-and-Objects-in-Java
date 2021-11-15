public class Main {
    public static void main(String[] args) {
        Fan Fan1 = new Fan();
        Fan1.setSpeed(Fan1.getFast());
        Fan1.setRadius(10);
        Fan1.setColor("yellow");
        Fan1.setStatus(true);
        System.out.println(Fan1);

        Fan Fan2 = new Fan();
        Fan2.setSpeed(Fan2.getMedium());
        Fan2.getColor();
        Fan2.getRadius();
        Fan2.getStatus();
        System.out.println(Fan2);
    }
}
