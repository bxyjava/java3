# java3
Java实验四 接口程序实验
一、 实验目的：
1.掌握Java中抽象类和抽象方法的定义；
2.掌握Java中接口的定义，熟练掌握接口的定义形式以及接口的实现方法；
3.了解异常的使用方法，并在程序中根据输入情况做异常处理。
二、 实验内容
某学校为了给学生提供勤工俭学机会，也减轻授课教师的部分压力，准许博士研究生参与课程的助教工作。此时，该博士研究生有双重身份：学生和助教教师。
1.设计两个管理接口：学生管理接口和教师管理接口。学生接口必须包括缴纳学费、查学费的方法；教师接口包括发放薪水和查询薪水的方法。
2.设计博士研究生类，实现上述的两个接口，该博士研究生应具有姓名、性别、年龄、每学期学费、每月薪水等属性。
3.编写测试类，并实例化至少两名博士研究生，统计他们的年收入和学费。根据两者之差，算出每名博士研究生的年应纳税金额。
三、 实验要求：
1.在”博士研究生类”中实现各个接口定义的抽象方法;
2.对年学费和年收入进行统计，用收入减去学费，求得纳税额；
3.国家最新纳税标准（系数），属于某一时期的特定固定值，与实例化对象没有关系，考虑如何用static final修饰定义；
4.实例化研究生类时，可采用运行时通过main方法的参数args一次性赋值，也可采用Scanner类实现运行时交互式输入；
5.根据输入情况，要在程序中做异常处理。
四、 实验流程:
1.根据实验内容，设立两个接口，学生管理接口和教师管理接口，并声明缴纳学费，查询学费（学生管理接口），支付薪水，查询薪水（教师管理接口）；
2.根据实验内容，设计博士研究生类，并利用set与get方法来实现以上两个接口，同时添加姓名，性别，年龄，每学期学费，每月薪水属性；
3.对博士研究生类进行复写，以便在Test类中输出；
4.自定义异常类Aexception，以便在Test类中能使用户输入正确的姓名；
5.设计Test类。
五、 核心代码
public static void main(String[] arg) {
        JINE[] x = new JINE[2];
        for (int e = 0; e < 2; e++) {
            x[e] = new JINE();
            while (true) {
                try {
                    System.out.println("请输入姓名");
                    Scanner name = new Scanner(System.in);
                    String p =name.nextLine();
                    x[e].setName(p);
                    if (p.matches("[^a-z]"))
                        throw new  AE();
                    break;
                }
                catch (AE w){
                    System.out.println("您输入有误");
                }
            }
            System.out.println("请输入性别");
            Scanner sex = new Scanner(System.in);
            x[e].setSex(sex.nextLine());
            while (true) {
                try {
                    System.out.println("请输入年龄");
                    Scanner age = new Scanner(System.in);
                    x[e].setAge(age.nextInt());
                    break;
                } catch (Exception q) {
                    System.out.println("输入错误，请重新输入");
                }
            }
            while (true) {
                try {
                    System.out.println("请输入学费");
                    Scanner fees = new Scanner(System.in);
                    x[e].setFees(fees.nextDouble());
                    break;
                } catch (Exception q) {
                    System.out.println("输入有误，请重新输入");
                }
            }
            System.out.println("请输入工资");
            Scanner roll = new Scanner(System.in);
            x[e].setRoll(roll.nextDouble());
            System.out.println(x[e]);
        }
六、 实验结果
七、 实验感想
本次实验主要考查对抽象类与接口的方法的运用，同时在建立类与实例的连接上回顾了之前学过的相关知识。
本次实验的难度比较适中，在学过的基础上其实更是针对性的强化，但在接口和继承的综合应用时有难度的提升，
这次实验的应用，确实提高了我有关Java的代码能力，同时对理论知识的掌握也在实践的过程中不断深化，实验课是十分有效果的。
