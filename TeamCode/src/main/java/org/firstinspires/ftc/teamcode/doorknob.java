package org.firstinspires.ftc.teamcode;

public class doorknob {

    public static class returnvolumeofrectangularprism{

        public static double returnvolumeofrectangularprism(double length, double width, double height){
            double volume = length * width * height;
            return volume;
        }
        
        public static void main(String[] args) {
            double length = 5.0;
            double width = 3.0;
            double height = 2.0;
            double volume = returnvolumeofrectangularprism(length, width, height);
        }
    }
}
