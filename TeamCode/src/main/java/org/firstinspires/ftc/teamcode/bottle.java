package org.firstinspires.ftc.teamcode;

public class bottle {
    public static int volrectprism(int l, int w, int h) {
        return l*w*h;
    }
    public static int vol4rectprism() {
        return volrectprism(4 ,3, 7)*4;
        
    }

    public static void main(String[] args) {
        System.out.println(volrectprism(4,3,7));
        System.out.println(vol4rectprism());
    }
}