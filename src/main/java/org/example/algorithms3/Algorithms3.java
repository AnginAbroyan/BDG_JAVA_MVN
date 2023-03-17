package org.example.algorithms3;

public class Algorithms3 {

    static int m = 3;
    static int count = 0;
    static int i = 0;

    /**
     * Methods prints out the given text n^n times.
     * @param n
     * @returns complexity number O(n^n)
     */
    public int nPowNTimesRepeat(int n) {
        i++;
        while (i < n) {
            m *= n;
            while (i <= m) {
                count++;
                System.out.println("Ես դուրս չեմ մնացել։");
                nPowNTimesRepeat(n);
            }
        }
        return count;
    }











    public static void main(String[] args){
        Algorithms3 obj = new Algorithms3();
        System.out.println(obj.nPowNTimesRepeat(2));
    }
}
