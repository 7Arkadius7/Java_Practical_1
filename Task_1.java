import java.util.Scanner;

// 1. Вычислить n-ое треугольное число (сумма чисел
// от 1 до n), n! (произведение чисел от 1 до n)

public int countN (int n){
    int sum = 0;
    for(int i = 1; i<=n; i++){
        sum+=i;
    }
    return sum;
}