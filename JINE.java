package 接口程序实验;

import java.util.Scanner;

class JINE implements StudentManager, TeacherManager {
    private String name;
    private String sex;
    private int age;
    double fees;
    private double roll;

    JINE(){

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setFees(double fees) {
        this.fees = fees;
    }

    public void setRoll(double roll) {
        this.roll = roll;
    }

    public void PayFees() {
        while (true) {
            Scanner x = new Scanner(System.in);
            double Fees = x.nextDouble();
            if (Fees - fees > 0) {
                System.out.println("输入有误，请重新输入");
            } else if (Fees - fees < 0) {
                System.out.println("输入有误，请重新输入");
            } else {
                System.out.println("成功");
                break;
            }
        }
    }



    public double CheckTuition(){
        return fees;
    }

    public double PayRoll(){
        return roll;
    }
    public double QuerySalary() {
        return roll;
    }

    public String toString() {
        return "学生信息为{" + "姓名'" + name + "性别'" + sex + ", 年龄" + age + ", 学费(每学期)" + fees + ", 鏀跺叆(绋庡墠姣忔湀)" + roll + '}';
    }
}