package ver3.ch9;

public class RandomEx3 {
    public static void main(String[] args) {

    }

    public static int[] fillRand(int[] arr, int from ,int to) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = getRand(from, to);
        }

        return arr;
    }

    public static int[] fillRand(int[] arr, int[] data) {
        for (int i = 0; i < arr.length; i++)
            arr[i] = data[getRand(0, data.length-1)];

        return arr;
    }

    public static int getRand(int from, int to) {
        return (int)(Math.random() * (Math.abs(to-from) + 1)) + Math.min(from, to);
    }
}
