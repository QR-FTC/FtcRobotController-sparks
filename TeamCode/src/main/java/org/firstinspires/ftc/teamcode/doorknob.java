package org.firstinspires.ftc.teamcode;

public class doorknob {

    public static class returnvolumeofrectangularprism{

        public static double returnvolumeofrectangularprism(double length, double width, double height){
            double volume = length * width * height;
            return volume;
        }

            public static double multiplyvolumeby4(double volume){
            double newvolume = volume * 4;
                return newvolume;
            }


        public static void main(String[] args) {
            double length = 5.0;
            double width = 3.0;
            double height = 2.0;
            double volume = returnvolumeofrectangularprism(length, width, height);
            System.out.println("The volume of the rectangular prism is: " + volume);
            double newvolume = multiplyvolumeby4(volume);
            System.out.println("The new volume of the rectangular prism is: " + newvolume);
        }
    }
}
