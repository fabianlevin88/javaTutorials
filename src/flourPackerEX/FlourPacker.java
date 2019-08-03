package flourPackerEX;

public class FlourPacker {

    public static boolean canPack(int bigCount, int smallCount, int goal) {

        int capacityBig = (bigCount * 5);
        int totalCapacity = capacityBig + smallCount;

        if (bigCount < 0 || smallCount < 0 || goal < 0 || ((totalCapacity) < goal)) {
            return false;
        }

        if (goal<5 && goal<smallCount){
            return true;

        } else if (goal>=5){
            int lessThanBig = goal%5;

            if (lessThanBig<=smallCount){
                return true;
            }
        }

        return false;
    }
}
