package Mnozenie;

public class Calculations {

    public int changeNumber(int x, int  size) {
        //Given
        int y = (int) Math.pow(2,size);
        int result = 0;
        //When
        for (int i = size; i >= 0; i--,y/=2) {
            result += ((x+y) / (y*2) % 2) * y;
        }
        //Then
        return result;
    }

    public int solutionOfTwoNumbers(int a, int b, int bulb) {
        //Given
        int x = (a * b);
        //x = decisive formula about the shape image
        int y = (int) Math.pow(2,bulb-1);
        //Then
        return (x / y) % 2;
    }
}