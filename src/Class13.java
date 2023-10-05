// источник: https://yandex.ru/video/preview/15450725740556356687
// источник: https://youtu.be/5qO0iq-5fqA
// закончил на мин 02 10

public class Class13 {
    public static void main(String[] args) {
        Tachki my_porsche = new Tachki();
        my_porsche.pass = 2;
        my_porsche.bak = 50;
        my_porsche.litrov_na_10_rm = 2;
        System.out.println(my_porsche.pass +" "+ my_porsche.bak +" "+ my_porsche.litrov_na_10_rm);
        my_porsche.mogu_proehat();
        System.out.println("При полном баке в " + my_porsche.bak + " литров, можно проехать " + my_porsche.mogu_proehat_in_km() + " километров");
        float er_proc = 3;
        System.out.println("При полном баке в " + my_porsche.bak + " литров, можно проехать " + my_porsche.mogu_proehat_in_km_er_in_procent(er_proc) + " километров " +
                "(с учетом ошибки в "+er_proc+"%).");


        Tachki my_bus = new Tachki();
        my_bus.pass = 12;
        my_bus.bak = 120;
        my_bus.litrov_na_10_rm = 1.5f;
        System.out.println(my_bus.pass +" "+ my_bus.bak +" "+ my_bus.litrov_na_10_rm);
        my_bus.mogu_proehat();
        System.out.println("При полном баке в " + my_bus.bak + " литров, можно проехать " + my_bus.mogu_proehat_in_km() + " километров");

    }
}

class Tachki {
        int pass; // кол. пас.
        float bak; // разм. бака
        float litrov_na_10_rm; // л. на 10 км
    void mogu_proehat() {
            System.out.println("При полном баке в " + bak + " литров, можно проехать " + bak * 10 / litrov_na_10_rm + " километров");
            if (5 == 5) return;
            System.out.println("************************");

    }

    float mogu_proehat_in_km() {
        return bak*10/litrov_na_10_rm;
    }

    float mogu_proehat_in_km_er_in_procent(float er_procent) {
        return bak*10/litrov_na_10_rm*(1-er_procent/100);
    }


}
