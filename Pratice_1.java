package com.company;
abstract  class pen{
    abstract void write();
   abstract void refill();
}
class fountain_Pen extends pen{
     void write(){
         System.out.println("write");
    }

    @Override
    void refill() {
        System.out.println("refill");
    }
    void  Changenib(){
        System.out.println("Changing the nib");
    }
}
public class pratice_code1 {
    public static void main(String[] args) {
        fountain_Pen fp=new fountain_Pen();
        fp.refill();
    }
}
