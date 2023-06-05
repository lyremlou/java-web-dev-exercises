package org.launchcode.java.demos.lsn3classes1;

public class SchoolPractice {
    public static void main(String[] args) {
        Student maryS = new Student();
        maryS.setName("Mary Sanders");
        maryS.setNumberOfCredits(1);
        maryS.setGpa(4.0);
        System.out.println(maryS.getName());
        System.out.println(maryS.getNumberOfCredits());
        System.out.println(maryS.getGpa());

    }
}
