public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();


    }

    public static void task1() {
        System.out.println("Задача 1");

        int paperMan = 6;
        byte bigBan = 9;
        short doubleClass =    13;
        long veryBig = 2543L;
        float s = 23.45f;
        double di = 6.1254;
        System.out.println(" значение переменной int  с типом paperMan равно" + paperMan);
        System.out.println(" значение переменной byte  с типом bigBan равно" + bigBan);
        System.out.println(" значение переменной short  с типом short равно" + doubleClass);
        System.out.println(" значение переменной long  с типом  veryBig равно" + veryBig);
        System.out.println(" значение переменной float  с типом  s равно" + s);
        System.out.println(" значение переменной double  с типом  di равно" + di);

    }

    public static void task2() {
        System.out.println("Задача 2");
        float teamFirst = 27.12f;
        Long teamSecond = 987_678_965_549L;
        double teamTri = 2.786;
        short teamFour = 569;
        char charFive = 159;
        int intSix = 27897;
        byte byteSeven = 67;
        System.out.println(teamFirst);
        System.out.println(teamSecond);
        System.out.println(teamTri);
        System.out.println(teamFour);
        System.out.println(charFive);
        System.out.println(intSix);
    }


    public static void task3() {
        System.out.println("Задача 3");
        int luda  = 23;
        int anna = 27;
        int kata = 30;
        int paperTotal = 480;
        int totalpeper = luda + anna + kata;
        int onlyPeple = paperTotal / ( luda+anna+kata);
        System.out.println(luda);
        System.out.println(anna);
        System.out.println(kata);
        System.out.println(paperTotal);
        System.out.println(totalpeper);
        System.out.println(onlyPeple);

    }


    public static void task4() {
        System.out.println("Задача 4");
        int buttles = 16;
        int minuts = 2;
        int oneMinuts = buttles/minuts;
        int buttles20= oneMinuts *20;
        int buttlesHour=buttles20*3;
        int buttlesDay=buttlesHour*24;
        int buttles3Day=buttlesDay*3;
        int buttlesMonth= buttles3Day*10;
        System.out.println("за 20 минут машина произвела " + buttles20 + " штук бутылок");
        System.out.println("за 1 час машина произвела " + buttlesHour + " штук бутылок");
        System.out.println("за день машина произвела " + buttlesDay + " штук бутылок");
        System.out.println("за  3 дня машина произвела " + buttles3Day + " штук бутылок");
        System.out.println("за месяц машина произвела " + buttlesMonth + " штук бутылок");


    }
    public static void task5() {
        System.out.println("Задача 5");
        int totalCans = 120;
        int whiteCansPerClass = 2;
        int brounCansPerClass = 4;
        int totalClasses = totalCans / ( whiteCansPerClass+brounCansPerClass);
        int totalWhiteCans = whiteCansPerClass*totalClasses;
        int totalBrounCans = brounCansPerClass*totalClasses;


        System.out.println("В школе, где "+ totalClasses +" классов, нужно "+totalWhiteCans+" банок белой краски и"+ totalBrounCans +" банок коричневой краски");
    }
    public static void task6() {
        System.out.println("Задача 6");
        int totalBanans = 5;
        int oneBanan =80;
        int massaBanan =totalBanans*oneBanan;
        int objemMoloka= 200;
        int massaMoloka= objemMoloka/100*105;
        int kolichestvoMorojenogo=2;
        int massaBricketa=100;
        int massaMorojenogo=kolichestvoMorojenogo*massaBricketa;
        int jaca = 4;
        int oneJaca =  70;
        int massJaca = jaca*oneJaca;
        int sportPit = massaBanan+massaMoloka+massaMorojenogo+massJaca;
        float sportPitKg= sportPit/1000f;
        System.out.println("Общая масса напитка - "+ sportPit+"г ("+sportPitKg+"кг)");






    }
    public static void task7() {
        System.out.println("Задача 7");
        int nyjnoSbrosit =7;
        int nyjnoSbrositGm=nyjnoSbrosit*1000;
        int minusVes1 = 250;
        int minusVes2 = 500;
        int poteryn1 = nyjnoSbrositGm/minusVes1;
        int poteryn2 = nyjnoSbrositGm/minusVes2;
        int sredniDay = (poteryn1+poteryn2)/2;
        System.out.println(minusVes1);
        System.out.println(minusVes2);
        System.out.println(poteryn1);
        System.out.println(poteryn2);
        System.out.println(sredniDay);
        System.out.println("если спортсмен будет терять каждый день по 250 грамм то уйдет дней "+ poteryn1 + " а если спортсмен будет терять каждый день по 500 грамм то уйдет дней "+poteryn2+"  ");



    }
    public static void task8() {
        System.out.println("Задача 8");
        int masha = 67760;
        int denis  = 83690;
        int kriss = 76230;
        float omgMasha =masha*1.1f;
        float omgDenisenis=denis*1.1f;
        float omgKriss=kriss*1.1f;
        System.out.println(omgMasha);
        System.out.println(omgDenisenis);
        System.out.println(omgKriss);
        float yearMasha = masha*12f;
        float yearDenisenis= denis*12f;
        float yearKris= kriss*12f;
        float yearOmgMasha = omgMasha*12f;
        float yearOmgDenisenis= omgDenisenis*12f;
        float yearOmgKris= omgKriss*12f;
        System.out.println(yearMasha);
        System.out.println(yearDenisenis);
        System.out.println(yearKris);
        System.out.println(" Маша теперь получает "  + omgMasha  + " рублей . Годовой доход вырос на  + " +( yearOmgMasha - yearMasha  )  + " рублей ");
        System.out.println(" Денис теперь получает "  + omgDenisenis  + " рублей . Годовой доход вырос на  + " +( yearOmgDenisenis - yearDenisenis  )  + " рублей ");
        System.out.println(" Маша теперь получает "  + omgKriss  + " рублей . Годовой доход вырос на  + " +( yearOmgKris - yearKris  )  + " рублей ");

    }









}

