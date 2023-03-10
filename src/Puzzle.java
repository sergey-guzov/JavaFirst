public class Puzzle {
    static int Play () {
        Value[] values = new Value[6];
        int i = 0;
        int number = 1;
        while (i < 6) {
            values[i] = new Value();
            values[i].setIntValue(number);
            i = i + 1;
            number = number * 10;
        }
        int result = 0;
        i = 6;
        while (i > 0) {
            i = i-1;
            result = result + values[i].doStuff(i);
        }
        return result;
    }
}

class Output {
    public static void main(String[] args) {
        Puzzle firstPuzzle = new Puzzle();
        System.out.printf("Result is %d%n", firstPuzzle.Play());
    }
}

class Value {
    int intValue;

    public void setIntValue(int val) {
        intValue = val;
    }

    public int doStuff(int factor) {
        if (intValue > 100) {
            return  intValue * factor;
        }
            else {
                return intValue * (5 - factor);
        }
    }
}