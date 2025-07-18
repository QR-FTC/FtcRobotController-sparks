package org.firstinspires.ftc.teamcode;

public class doorknob {

    public static class returnvolumeofrectangularprism{

        public static double returnvolumeofrectangularprism(double length, double width, double height){
            double volume = length * width * height;
            return volume;
        }
        public static class multiplyvolumeby4{
            public static double multiplyvolumeby4(double volume){
                double newvolume = volume * 4;
                return newvolume;
            }
        }

        public static void main(String[] args) {
            double length = 5.0;
            double width = 3.0;
            double height = 2.0;
            double volume = returnvolumeofrectangularprism(length, width, height);
            System.out.println("The volume of the rectangular prism is: " + volume);
            System.out.println("the volume multiplied by 4 is " + multiplyvolumeby4.multiplyvolumeby4(volume));
        }
    }
}
