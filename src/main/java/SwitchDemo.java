public class SwitchDemo {
    enum Color {GREEN, RED, BLUE}

    public static void printName(Color color) {
        switch (color) {
            case BLUE: //无需使用Color进行引用
                System.out.println("蓝色");
                break;
            case RED:
                System.out.println("红色");
                break;
            case GREEN:
                System.out.println("绿色");
                break;
        }
    }

    public static void main(String[] args) {
        printName(Color.BLUE);      //蓝色
        printName(Color.RED);       //红色
        printName(Color.GREEN);     //绿色
    }

}
