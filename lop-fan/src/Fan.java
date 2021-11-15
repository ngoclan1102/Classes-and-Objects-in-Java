public class Fan {
    int slow = 1;
    int medium = 2;
    int fast = 3;
    int speed = slow;
    boolean status = false;
    double radius = 5;
    String color = "blue";

    public int getSlow() {
        return slow;
    }

    public int getMedium() {
        return medium;
    }

    public int getFast() {
        return fast;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean getStatus() {
        return status;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setSlow(int slow) {
        this.slow = slow;
    }

    public void setMedium(int medium) {
        this.medium = medium;
    }

    public void setFast(int fast) {
        this.fast = fast;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        if (!this.status){
            return getSpeed() + "\n" + getColor() + "\n" + getRadius() + "\n" + "fan is on";
        }else {
            return getColor() + "\n" + getRadius() + "\n" + "fan is off";
        }
    }
}

