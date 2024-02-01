package lesson3;

public class Task3 {
    public static void main(String[] args) {
        //У нас есть 2 массива
        //Нужно одним циклом из них сделать один общий массив
        char[] abcd = {'a', 'b', 'c', 'd'};
        char[] qwer = {'q', 'w', 'e', 'r'};
        int abcdLengh = abcd.length;
        char[] abcdqwer = new char[abcdLengh + qwer.length];

//        abcdqwer[0] = abcd[0];
//        abcdqwer[1] = abcd[1];
//        abcdqwer[2] = abcd[2];
//        abcdqwer[3] = abcd[3];
//
//        abcdqwer[4] = qwer[0]; - 4 = 0
//        abcdqwer[5] = qwer[1]; - 4 = 1
//        abcdqwer[6] = qwer[2]; - 4 = 2
//        abcdqwer[7] = qwer[3]; - 4 = 3

        for (int i = 0; i < abcdqwer.length; i++){
            if (i < abcdLengh) {
                abcdqwer[i] = abcd[i];
            }else {
                    abcdqwer[i] = qwer[i - abcdLengh];
                }
            }
        }
    }

