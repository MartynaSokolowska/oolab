package agh.ics.oop;

public class OptionParser {

    public MoveDirection[] parse(String[] arguments) {

        int i = 0;
        MoveDirection[] tablicakierunkow = new MoveDirection[arguments.length];
        for (String arg : arguments) {
            if (arg.equals("f") || arg.equals("forward")) {
                tablicakierunkow[i] = MoveDirection.FORWARD;
                i = i + 1;
                continue;
            }
            if (arg.equals("b") || arg.equals("backward")) {
                tablicakierunkow[i] = MoveDirection.BACKWARD;
                i += 1;
                continue;
            }
            if (arg.equals("r") || arg.equals("right")) {
                tablicakierunkow[i] = MoveDirection.RIGHT;
                i += 1;
                continue;
            }
            if (arg.equals("l") || arg.equals("left")) {
                tablicakierunkow[i] = MoveDirection.LEFT;
                i += 1;
                continue;
            }
            throw new IllegalArgumentException(arg + " is not legal move specification");

        }
        return tablicakierunkow;
    }
}
