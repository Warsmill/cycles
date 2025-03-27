public class Main {
    public static void main(String[] args) {
        for(int i = 1; i <= 10 ; i++){
            System.out.println(i);
        }

        for(int i = 10; i >=  1; i--){
            System.out.println(i);
        }

        for ( int i = 0; i< 17; i+=2){
            System.out.println(i);
        }

        for ( int i = 10; i >= -10; i--){
            System.out.println(i);
        }
        for (int i = 1904; i <= 2096; i+=4){
            System.out.println(i);
        }

        for (int i = 7; i <= 98; i+=7){
            System.out.println(i);
        }

        for (int i = 1; i <= 512; i*=2){
            System.out.println(i);
        }

        int savings = 29000;
        int amountSavings = 0;
        for (int i = 1; i  <= 12; i++){
            amountSavings += savings;
            System.out.println("Месяц " + i + " ,сумма накоплений равна " + amountSavings + " рублей");
        }

    }
}