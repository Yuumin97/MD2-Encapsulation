import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TamGiacVuong tamGiacVuong = new TamGiacVuong();
        Scanner scanner = new Scanner(System.in);
        int number  = 1;

        do {
            System.out.println("1. In ra diện tích tam giác vuông khi biết 2 cạnh góc vuông ");
            System.out.println("2. In ra diện tích tam giác vuông khi biết 1 cạnh góc vuông và cạnh huyền");
            System.out.println("3. Exit");
            number = scanner.nextInt();


            switch (number) {
                case 1:
                    System.out.println("Nhập cạnh góc vuông A & B");

                    tamGiacVuong.setCanhA(scanner.nextInt()); ;
                    tamGiacVuong.setCanhB(scanner.nextInt());
                    tamGiacVuong.setsTamGiacVuong(0.5*(tamGiacVuong.getCanhA()*tamGiacVuong.getCanhB()));
                    System.out.println("Diện tích tam giác vuông là: " + tamGiacVuong.getsTamGiacVuong());
                    break;
                case 2:
                    System.out.println("Nhập cạnh góc vuông và cạnh huyền");
                    tamGiacVuong.setCanhA(scanner.nextInt());
                    tamGiacVuong.setCanhHuyen(scanner.nextInt());
                    tamGiacVuong.setsTamGiacVuong(Math.sqrt(tamGiacVuong.getCanhHuyen()* tamGiacVuong.getCanhHuyen()- tamGiacVuong.getCanhA()* tamGiacVuong.getCanhA()) * tamGiacVuong.getCanhA()*0.5);
                    System.out.println("Diện tích tam giác vuông là: " + tamGiacVuong.getsTamGiacVuong());
                    break;
            }
        }
        while (number != 3);
    }
}