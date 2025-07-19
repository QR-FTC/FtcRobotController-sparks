package org.firstinspires.ftc.teamcode;

public class toaster {
    public static int getVolume(int w, int l, int d){
        return w * l * d;
    }
    public static void main(String[] args) {
        System.out.print(getVolume(3, 4, 12));
    }
}
