import java.text.DecimalFormat;
import java.util.concurrent.CountDownLatch;

public class Main {
    public static void main(String[] args) {
        /*
        kintamieji
        salyginiai sakiniai
        ciklai
        funkcijos (mrtodai)
        klases (00P)
        interfeisai
         */
//        byte manoAmzius = 19;
//        System.out.println(manoAmzius);
//        manoAmzius = 18;
//        System.out.println(manoAmzius);
////        short sortai = 12345;
//        int teisingasSkaicius = 2135000200;
//        long ilgasSkaicius = 6565656565656565L;
////        float kaina = 40.45F;
//        double PI = 3.14172656556565:
//        boolean willWeLearnSomething = true;
//        boolean willItBeEasy = false;
//        char aLetter = 'b';
//        char numberChar = '5';
//        String manoVard = "Iveta";
//        String miestas = "Kaunas";
//        String darbas = "mokslas";
//        System.out.println("Labas " + "Labas" + " " + miestas);
//        System.out.println(7 + 5 + " skaicius ");// 12 skaicius, prasideda skaiciumi, del to susideda;
//        System.out.println(" skaicius " + 7 + 5);// skaicius 75;
//        System.out.println(" skaicius " + (7 + 5));// skaicius 12;
//        System.out.println("as esu " + manoVard);

//        if (true) {
//            System.out.println("sako tiesa");
//        } else {
//            System.out.println("sako netiesa");
//        }
//        if (5 > 7) {
//            System.out.println("taip");
//        } else {
//            System.out.println("ne");
//        }

//        int num1 = 65;
//        int num2 = 655;
//        if (num1 > num2) {
//            System.out.println("if. skaicius " + num1 + " yra didesnis uz " + num2);
//        } else if (num1 < num2) {
//            System.out.println("else. skaicius " + num2 + " yra didesnis uz " + num1);
//        } else {
//            System.out.println("skaiciai " + num1 + " yra vienodi");
//        }
//
//        if (num1 > num2) {
//            System.out.println("if. skaicius " + num1 + " yra didesnis uz " + num2);
//        }
//        if (num1 < num2) {
//            System.out.println("else. skaicius " + num2 + " yra didesnis uz " + num1);
//        }
//        if (num1 == num2) {
//            System.out.println("skaiciai " + num1 + " yra vienodi");
//        }
//
//        sintakse;
//        if(){}
//        else(){}
//        for(){}
//        while(){}
//        function(){}
//        switch(){}
//
// Kintamieji ir salygos

        System.out.println("//////////// 1 uzduotis ///////////////");
        String manoVardas = "Iveta";
        String manoPav = "Eisimantaitė";
        int gimMetai = 2004;
        int sieMetai = 2024;
        System.out.println("Aš esu " + manoVardas + " " + manoPav + ". " + "Man yra " + (sieMetai - gimMetai) + " metai(ų).");

        System.out.println("//////////// 2 uzduotis ///////////////");
        int numb1 = (int) Math.round(Math.random() * 4);
        int numb2 = (int) Math.round(Math.random() * 4);

        System.out.println(numb1 + " " + numb2);
        if (numb1 != 0 && numb2 != 0) {
            if (numb1 > numb2) {
                System.out.println(Math.round((double) numb1 / numb2 * 100) / 100.0);
            } else {
                System.out.println(Math.round((double) numb1 / numb2 * 100) / 100.0);
            }
        } else {
            System.out.println("dalyba is 0 negalima");
        }

        System.out.println("//////////// 3 uzduotis ///////////////");
        int n1 = (int) Math.round(Math.random() * 25);//20  10    15  15     20  10
        int n2 = (int) Math.round(Math.random() * 25);//15  15    20  10     10  20
        int n3 = (int) Math.round(Math.random() * 25);//10  20    10  20     15  15
        System.out.println(n1 + " " + n2 + " " + n3);
        //20>15     ir 15>10    arba 10<15     ir 15<20
        if((n1 > n2 && n2 > n3) || (n1 < n2 && n2 < n3)){
            System.out.println("vidurine reiksme turintis kintamasis: " + n2);}

        if ((n2 > n1 && n1 > n3) || (n2 < n1 && n1 < n3)){
            System.out.println("vidurine reiksme turintis kintamasis: " + n1);}

        if ((n1 > n3 && n3 > n2) || (n1 < n3 && n3 < n2)){
            System.out.println("vidurine reiksme turintis kintamasis: " + n3);}

        if (n1 == n2 || n1 == n3 || n2 == n3 ){
            System.out.println("nera vidurines reiksmes, kadangi yra vienodu skaiciu");
        }

        System.out.println("///////////// 4 uzduotis ///////////");

        int min = 1;
        int max = 10;

        int a = (int) (min + Math.round( Math.random() * (max - min)));
        int b = (int) (min + Math.round( Math.random() * (max - min)));
        int c = (int) (min + Math.round( Math.random() * (max - min)));

        System.out.println("kai " + "a=" + a + "; b=" + b + "; c=" + c);
        if ((a + b) >= c && (a + c) >= b && (b + c) >= a){
            System.out.println("trikampis susidaro");
        }else{
            System.out.println("trikampis nesusidaro");
        }
        System.out.println("/////////// 5 uzduotis //////////////");

        int nr1 = (int) Math.round(Math.random() * 2);
        int nr2 = (int) Math.round(Math.random() * 2);
        int nr3 = (int) Math.round(Math.random() * 2);
        int nr4 = (int) Math.round(Math.random() * 2);

        int countZeros = 0;
        int countOnes = 0;
        int countTwos = 0;

//        countZeros = countZeros + 1;

        if (nr1 == 0){
            countZeros++;}
        if (nr1 == 1){
            countOnes++;}
        if (nr1 == 2){
            countTwos++;}

        if (nr2 == 0){
            countZeros++;}
        if (nr2 == 1){
            countOnes++;}
        if (nr2 == 2){
            countTwos++;}

        if (nr3 == 0){
            countZeros++;}
        if (nr3 == 1){
            countOnes++;}
        if (nr3 == 2){
            countTwos++;}

        if (nr4 == 0){
            countZeros++;}
        if (nr4 == 1){
            countOnes++;}
        if (nr4 == 2){
            countTwos++;}

        System.out.println("nuliukai: " + countZeros + ", vienetukai: " + countOnes + ", dvejetukai: " + countTwos);


        System.out.println("/////////////// 6 uzduotis //////////////");

        int min1= -10;
        int max1 = 10;

        int sk1 = (int) (min1 + Math.round( Math.random() * (max1 - min1)));
        int sk2 = (int) (min1 + Math.round( Math.random() * (max1 - min1)));
        int sk3 = (int) (min1 + Math.round( Math.random() * (max1 - min1)));

        if (sk1 < 0){
            System.out.print("[" + sk1 + "]" + ", ");}
        if (sk1 == 0){
            System.out.print("(" + sk1 + ")" + ", ");}
        if (sk1 > 0){
            System.out.print("{"+ sk1 + "}" + ", ");}

        if (sk2 < 0){
            System.out.print("[" + sk2 + "]" + ", ");}
        if (sk2 == 0){
            System.out.print("(" + sk2 + ")" + ", ");}
        if (sk2 > 0){
            System.out.print("{"+ sk2 + "}" + ", ");}

        if (sk3 < 0){
            System.out.println("[" + sk3 + "]");}
        if (sk3 == 0){
            System.out.println("(" + sk3 + ")");}
        if (sk3 > 0){
            System.out.println("{"+ sk3 + "}");}

        System.out.println("/////////////// 7 uzduotis //////////////");

        int min2= 5;
        int max2 = 3000;

        int candles = (int) (min2 + Math.round( Math.random() * (max2 - min2)));

        if (candles <= 1000 ){
            System.out.println("perkamas zvakiu kiekis: " + candles + ", kaina: " + candles * 1 +  " EUR");
        }
        if (candles > 1000 && candles <= 2000 ){
            System.out.println("perkamas zvakiu kiekis: " + candles + ", kaina: " + candles * 0.97 +  " EUR");
        }
        if (candles > 2000){
            System.out.println("perkamas zvakiu kiekis: " + candles + ", kaina: " + candles * 0.96 +  " EUR");
        }

        System.out.println("/////////////// 8 uzduotis //////////////");

//        int number1 = (int) Math.round(Math.random() * 100);
//        int number2 = (int) Math.round(Math.random() * 100);
//        int number3 = (int) Math.round(Math.random() * 100);
        int number1 = 6;
        int number2 = 95;
        int number3 = 5;

        System.out.println(number1 + ", " + number2 + ", " + number3);

        System.out.println("pirmasis aritmetinis vidurkis: " + Math.round((number1 + number2 + number3)/ 3.0));

//        int sum = 0;
//        int argumentCount = 0;
//
//        if (number1 >= 10 && number1 <= 90){
//            sum += number1;
//            argumentCount++;
//        }
//
//        if (number2 >= 10 && number2 <= 90){
//            sum += number2;
//            argumentCount++;
//        }
//
//        if (number3 >= 10 && number3 <= 90){
//            sum += number3;
//            argumentCount++;
//        }
// if(count != 0) {
//        System.out.println(" aritmetinis vidurkis: " + (double) sum/argumentCount);
//sout (0);


//     complete with this  if (number1 <= 10 && number1 >= 90){
        if ((number1 <= 10 || number1 >= 90) && (number2 <= 10 || number2 >= 90) && (number3 <= 10 || number3 >= 90)){
            System.out.println("aritmetinio vidurkio isvesti negalima");
        } else if ((number1 <= 10 || number1 >= 90) && (number2 <= 10 || number2 >= 90))
                System.out.println("aritmetinis vidurkis: " + number3);{
        } else if ((number1 <= 10 || number1 >= 90) && (number3 <= 10 || number3 >= 90)) {
            System.out.println("aritmetinis vidurkis: " + number2);
            {
        } else if ((number2 <= 10 || number2 >= 90) && (number3 <= 10 || number3 >= 90)){
                System.out.println("aritmetinis vidurkis: " + number1);
            }if (number1 <= 10 || number1 >= 90){
                System.out.println("aritmetinis vidurkis: " + Math.round((number2 + number3)/ 2.0));
            }
            if (number2 <= 10 || number2 >= 90){
                System.out.println("aritmetinis vidurkis: " + Math.round((number1 + number3)/ 2.0));
            }
            if (number3 <= 10 || number3 >= 90){
                System.out.println("aritmetinis vidurkis: " + Math.round((number1 + number2)/ 2.0));
            }
            if ((number1 <= 10 || number1 >= 90) && (number2 <= 10 || number2 >= 90)){
                System.out.println("aritmetinis vidurkis: " + number3);
            }
        }


        if (number1 <= 10 || number1 >= 90){
            System.out.println("aritmetinis vidurkis: " + Math.round((number2 + number3)/ 2.0));
        }
        if (number2 <= 10 || number2 >= 90){
            System.out.println("aritmetinis vidurkis: " + Math.round((number1 + number3)/ 2.0));
        }
        if (number3 <= 10 || number3 >= 90){
            System.out.println("aritmetinis vidurkis: " + Math.round((number1 + number2)/ 2.0));
        }
        if ((number1 <= 10 || number1 >= 90) && (number2 <= 10 || number2 >= 90)){
            System.out.println("aritmetinis vidurkis: " + number3);
        }
        if ((number1 <= 10 || number1 >= 90) && (number3 <= 10 || number3 >= 90)){
            System.out.println("aritmetinis vidurkis: " + number2);
        }
        if ((number2 <= 10 || number2 >= 90) && (number3 <= 10 || number3 >= 90)){
            System.out.println("aritmetinis vidurkis: " + number1);
        }
        if ((number1 <= 10 || number1 >= 90) && (number2 <= 10 || number2 >= 90) && (number3 <= 10 || number3 >= 90)){
            System.out.println("aritmetinio vidurkio isvesti negalima");
        }




//           git config --global user.name "IvetaEi"
//            git config  --global user.email "ivetux159@gmail.com"








       }
    }