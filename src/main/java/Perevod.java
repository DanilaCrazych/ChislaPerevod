public class Perevod {
    public void Vosem(long a){
        long aber,out;
        int raya;
        int calhoon;

        System.out.println("Исходное число: " + a);
        calhoon = Integer.parseInt(String.valueOf(8));
        aber = Long.parseLong(String.valueOf(a),calhoon);
        raya = 2;
        out = Long.parseLong(Long.toString(a,raya));
        System.out.println("Двоичная система: " + out);
        calhoon = Integer.parseInt(String.valueOf(2));
        Long.parseLong(String.valueOf(out),calhoon);
        raya = 10;
        Long.parseLong(Long.toString(out,raya));
        System.out.println("Десятиричная система: " + aber);
        calhoon = Integer.parseInt(String.valueOf(10));
        Long.parseLong(String.valueOf(aber),calhoon);
        raya = 16;
        System.out.println("Шестнацетиричная система: " + Long.toString(aber,raya));
        System.out.println();

    }

    public void Six(String ab) {
        System.out.println("Исходное число: " + ab);
        long a = Long.valueOf(ab,16);
        long out,out2,out3;
        int raya;
        int calhoon;
        calhoon = Integer.parseInt(String.valueOf(10));
        Long.parseLong(String.valueOf(a),calhoon);
        raya = 2;
        out = Long.parseLong(Long.toString(Long.parseLong(String.valueOf(a)),raya));
        System.out.println("Двоичная система: " + out);
        calhoon = Integer.parseInt(String.valueOf(2));
        Long.parseLong(String.valueOf(out),calhoon);
        raya = 8;
        out2 = Long.parseLong(Long.toString(a,raya));
        System.out.println("Восьмиричная система: " + out2);
        calhoon = Integer.parseInt(String.valueOf(8));
        out3 = Long.parseLong(String.valueOf(out2),calhoon);
        raya = 10;
        System.out.println("Десятиричная система: " + Long.toString(out3,raya));
        System.out.println();
    }
}



