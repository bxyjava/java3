package �ӿڳ���ʵ��;

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
                System.out.println("������������������");
            } else if (Fees - fees < 0) {
                System.out.println("������������������");
            } else {
                System.out.println("�ɹ�");
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
        return "ѧ����ϢΪ{" + "����'" + name + "�Ա�'" + sex + ", ����" + age + ", ѧ��(ÿѧ��)" + fees + ", 收入(税前每月)" + roll + '}';
    }
}